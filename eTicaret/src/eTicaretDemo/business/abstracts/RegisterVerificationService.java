package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface RegisterVerificationService {

	boolean registerNameLengthCheck(User user);
	boolean registerPasswordLength(User user);
	boolean registerEmailAgainCheck(User user);
	boolean registerEmailFormatCheck(User user);
	boolean verification(User user);
}
