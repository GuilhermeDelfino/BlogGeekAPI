package br.com.bloggeek.controller;

import br.com.bloggeek.model.User;
import br.com.bloggeek.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping("/teste")
    public String hello() {
        return "Hello";
    }

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<UserRs> findAll() {
        var users = userRepository.findAll();
        return users
                .stream()
                .map(UserRs::converter)
                .collect(Collectors.toList());
    }
    @PostMapping("/users/post")
    public void saveUser(@RequestBody User user){
        var p = new User();
        p.setIdUser(ThreadLocalRandom.current().nextLong(3, 10000));
        p.setUsername(user.getUsername());
        p.setEmail(user.getEmail());
        p.setAge(user.getAge());
        p.setCep(user.getCep());
        p.setPassword(user.getPassword());
        p.setNumberAdress(user.getNumberAdress());
        userRepository.save(user);
    }
}
