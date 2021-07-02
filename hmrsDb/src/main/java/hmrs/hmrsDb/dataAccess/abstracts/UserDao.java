package hmrs.hmrsDb.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hmrs.hmrsDb.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
