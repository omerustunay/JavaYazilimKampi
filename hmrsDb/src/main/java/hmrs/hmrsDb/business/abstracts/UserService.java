package hmrs.hmrsDb.business.abstracts;

import java.util.List;

import hmrs.hmrsDb.entities.concretes.User;

public interface UserService {

	List<User> getAll();

}
