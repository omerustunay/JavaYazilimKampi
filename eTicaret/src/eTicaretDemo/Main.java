package eTicaretDemo;

import java.util.List;

import eTicaretDemo.business.concretes.MailVerificationManager;
import eTicaretDemo.business.concretes.RegisterVerificationManager;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.core.concretes.EmailVerificationManager;
import eTicaretDemo.core.concretes.GoogleLogManagerAdapter;
import eTicaretDemo.dataAccess.concretes.HibernateUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"omer","omerustunay@gmail.com","222222");
		User user2 = new User(2,"omer2","omerustunay2@gmail.com","222222");
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new RegisterVerificationManager(new EmailVerificationManager()), new MailVerificationManager(), new GoogleLogManagerAdapter());
		
		// Kullanici ekleme islemi
		userManager.add(user);
		userManager.add(user2);
		
		// Tum kullanicilar
		List<User> allEmailList= userManager.getAll();
		
		for(int i=0;i<allEmailList.size();i++)
			System.out.println(allEmailList.get(i).getName() + " adli kisinin email adresi: "+allEmailList.get(i).getEmail());
		
		// Kullanici silme islemi
		userManager.delete(user);

		// Kullanici guncelleme islemi
		userManager.update(user2);
		
		
		// signin islemi
		userManager.signIn(user2);

		
		// baska servis ile giris islemi
		userManager.addWithAnotherSignService(user2);
	
		
	}
}
