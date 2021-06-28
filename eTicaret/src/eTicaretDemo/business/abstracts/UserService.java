package eTicaretDemo.business.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface UserService {
	
	
	void add(User user);
	void addWithAnotherSignService(User user);
	void update(User user);
	void delete(User user);
	void signIn(User user);
	List<User> getAll();
}
