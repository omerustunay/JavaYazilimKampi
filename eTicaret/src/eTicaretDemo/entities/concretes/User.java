package eTicaretDemo.entities.concretes;

import eTicaretDemo.entities.abstracts.IEntity;

public class User implements IEntity{

	private int id;
	private String name;
	private String Email;
	private String password;
	
	
	public User() {
	}
	
	public User(int id, String name, String Email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.Email = Email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
