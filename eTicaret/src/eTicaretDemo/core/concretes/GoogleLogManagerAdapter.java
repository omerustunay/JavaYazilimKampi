package eTicaretDemo.core.concretes;

import eTicaretDemo.core.abstracts.LogService;
import eTicaretDemo.googleLogger.concretes.GoogleLogManager;

public class GoogleLogManagerAdapter implements LogService{

	@Override
	public void signToSystem(String message, String whetherSigned) {

		GoogleLogManager manager = new GoogleLogManager();
		manager.log(message, whetherSigned);
	}

}
