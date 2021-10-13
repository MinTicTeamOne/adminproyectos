package co.com.proyectos.adminproyectos.controllers;

import co.com.proyectos.adminproyectos.models.User;
import co.com.proyectos.adminproyectos.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
        User user1 = new User("001","Director", "Vinculado",34);
        User user2 = new User("002","Estudiante", "Matriculado",22);

        this.userRepository.save(user1);
        this.userRepository.save(user2);
    }

    @GetMapping("/participantes/{userId}")
    Optional<User> getUsers(@PathVariable String userId){
        return userRepository.findById(userId);
    }

    @GetMapping("/participantes")
    List<User> findAll(){
        return userRepository.findAll();
    }

}
