package jjfactory.learnmanage.business.repository.user;

import jjfactory.learnmanage.business.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
