package br.com.bloggeek.controller;

import br.com.bloggeek.model.User;
import br.com.bloggeek.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping("/teste")
    public String hello(){
        return "Hello";
    }
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/users")
    public List<UserRs> findAll(){
        var users = userRepository.findAll();
        return users.stream().map((p) -> UserRs.converter(p)).collect(Collectors.toList());
    }
}
