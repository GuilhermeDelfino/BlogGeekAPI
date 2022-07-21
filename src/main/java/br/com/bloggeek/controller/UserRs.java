package br.com.bloggeek.controller;
// Está classe tem o unico e claro objetivo de receber e passar informações

import br.com.bloggeek.model.User;
import lombok.Data;

@Data
public class UserRs {
    public static  UserRs converter(User p){
        var user = new UserRs();
        user.setIdUser(p.getIdUser());
        user.setUsername(p.getUsername());
        user.setEmail(p.getEmail());
        user.setAge(p.getAge());
        user.setCep(p.getCep());
        user.setPassword(p.getPassword());
        user.setNumberAdress(p.getNumberAdress());
        return user;
    }
    private long idUser;
    private String username,email,password;
    private int age,cep,numberAdress;

}
