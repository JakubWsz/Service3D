package pl.teb.spring.domain.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.teb.spring.infrastructure.entity.User;
import pl.teb.spring.infrastructure.repository.UserRepository;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(String firstname, String lastname, String email, String password){
       return userRepository.save(new User(UUID.randomUUID().toString(), firstname, lastname, email, password));
    }


}
