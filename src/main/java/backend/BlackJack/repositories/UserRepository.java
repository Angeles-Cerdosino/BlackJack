package backend.BlackJack.repositories;

import backend.BlackJack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameEquals(String username);

}
