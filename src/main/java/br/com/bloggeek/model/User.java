package br.com.bloggeek.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// gera id automatico
    @Column(name = "id_user")
    private Long idUser;

    @Column(name="username",nullable = false, length = 45)
    private String username;
    @Column(name="email",nullable = false, length = 100)
    private String email;
    @Column(name="password",nullable = false, length = 128)
    private String password;
    @Column(name="age",nullable = false, length = 3)
    private int age;
    @Column(name="cep",nullable = false, length = 3)
    private int cep;
    @Column(name="numberAdress",nullable = false, length = 3)
    private int numberAdress;
}

