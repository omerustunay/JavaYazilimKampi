package eTicaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	
	List<User> userList = new ArrayList<User>();
	@Override
	public void add(User user) {

		System.out.println("Kullanici veritabanına eklendi: "+ user.getName());
		userList.add(user);
	}

	@Override
	public void delete(User user) {

		System.out.println("kullanici silindi.");
		userList.remove(userList.get(user.getId()-1));
		
		
		
	}

	@Override
	public void update(User user) {

		System.out.println("Kullanici guncellendi.");
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userList;
	}

}
