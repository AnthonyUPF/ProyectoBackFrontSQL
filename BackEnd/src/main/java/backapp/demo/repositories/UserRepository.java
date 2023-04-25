package backapp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backapp.demo.models.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    
}
