package br.com.bloggeek.controller;

public class UserRq {


    private Long id;
    private String username;
    private String email;
    private int age;
    private int cep;
    private String password;
    private int numberAdress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumberAdress() {
        return numberAdress;
    }

    public void setNumberAdress(int numberAdress) {
        this.numberAdress = numberAdress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
