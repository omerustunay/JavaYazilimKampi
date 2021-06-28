package eTicaretDemo.business.concretes;

import java.util.List;

import eTicaretDemo.business.abstracts.MailVerificationService;
import eTicaretDemo.business.abstracts.RegisterVerificationService;
import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.core.abstracts.LogService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService{

	
	private UserDao userDao;
	private RegisterVerificationService registerVerification;
	private MailVerificationService mailVerification;
	private LogService loggerService;
	
	


	public UserManager(UserDao userDao, RegisterVerificationService registerVerification,
			MailVerificationService mailVerification, LogService loggerService) {
		super();
		this.userDao = userDao;
		this.registerVerification = registerVerification;
		this.mailVerification = mailVerification;
		this.loggerService = loggerService;
	}

	@Override
	public void add(User user) {
		
		if(registerVerification.verification(user)) {
			mailVerification.sendMailLink(user.getEmail());
			if(mailVerification.verificatedEmail(user.getEmail()))
				userDao.add(user);
		}		
	}

	@Override
	public void addWithAnotherSignService(User user) {

		
		loggerService.signToSystem("loglama yapildi", "giris basarili");
		userDao.add(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void signIn(User user) {
		// TODO Auto-generated method stub
		
		
		
		for (User email : userDao.getAll()) {
			if (email.getEmail() == user.getEmail()) {
				System.out.println(user.getEmail() + " ile giris yapilmistir");
			} else {
				System.out.println("Kaydiniz bulunmamaktadir! Lutfen uye olun.");
			}
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}
	
	

}
