package eTicaretDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.core.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService {
	
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	@Override
	public boolean validate(String emailStr) {
		    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		    return matcher.find();
	}
}
