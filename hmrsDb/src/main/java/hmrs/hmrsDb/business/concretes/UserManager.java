package hmrs.hmrsDb.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hmrs.hmrsDb.business.abstracts.UserService;
import hmrs.hmrsDb.dataAccess.abstracts.UserDao;
import hmrs.hmrsDb.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}



	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}
