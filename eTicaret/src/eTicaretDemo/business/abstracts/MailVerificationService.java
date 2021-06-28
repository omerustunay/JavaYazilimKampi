package eTicaretDemo.business.abstracts;

public interface MailVerificationService {

	void sendMailLink(String email);
	boolean verificatedEmail(String email);
}
