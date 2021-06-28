package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.MailVerificationService;

public class MailVerificationManager implements MailVerificationService {

	@Override
	public void sendMailLink(String email) {

		System.out.println(email + " adresine dogrulama maili gonderildi.");

	}

	@Override
	public boolean verificatedEmail(String email) {

		boolean currentEmailVerification = true;

		if (currentEmailVerification) {
			System.out.println("Mail adresiniz dogrulanmistir.");
			return true;
		} else {
			System.out.println("Mail adresi dogrulanmadi.");
			return false;
		}
	}
}
