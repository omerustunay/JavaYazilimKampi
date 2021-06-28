package eTicaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.business.abstracts.RegisterVerificationService;
import eTicaretDemo.core.abstracts.EmailVerificationService;
import eTicaretDemo.entities.concretes.User;

public class RegisterVerificationManager implements RegisterVerificationService {

	
	private List<String> listOfEmail = new ArrayList<String>();
	private EmailVerificationService emailService;
	
	
	public RegisterVerificationManager(EmailVerificationService emailService) {
		this.emailService = emailService;
	}

	@Override
	public boolean registerNameLengthCheck(User user) {
		if (user.getName().length() < 2) {
			System.out.println("kullanıcı adı en az 2 karakter olmalıdır.");
			return false;
		}
		return true;
	}

	@Override
	public boolean registerPasswordLength(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("password en az 6 karakter olmaldır.");
			return false;
		}
		return true;
	}

	@Override
	public boolean registerEmailAgainCheck(User user) {

		if(listOfEmail.size()>0) {
			if(listOfEmail.contains(user.getEmail())) {
				System.out.println("Email farklı kullanıcı tarafından kullanılmaktadır.");
				return false;
			}
		}

		listOfEmail.add(user.getEmail());
		return true;	
	}

	@Override
	public boolean registerEmailFormatCheck(User user) {
		
		if(!emailService.validate(user.getEmail())) {
			System.out.println("Email adres formatı yanlış.");
			return false;
		}
		return true;
	}
	
	@Override
	public boolean verification(User user) {
		if(registerEmailFormatCheck(user) && registerPasswordLength(user) && registerNameLengthCheck(user)) {
			if(registerEmailAgainCheck(user))
				return true;
		}
		return false;
	}

}
