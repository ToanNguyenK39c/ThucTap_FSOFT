package login.facebook.persistence.dao;

import login.facebook.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(final String username);

}
