package ru.arapov.testtask.models;

public class RegistrationDTO {

    private String username;
    private String password;
//    private Integer age;
//    private String email;

    public RegistrationDTO() {
        super();
    }

    public RegistrationDTO(String username, String password, Integer age, String email) {
        this.username = username;
        this.password = password;
//        this.age = age;
//        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Integer getAge() {
//        return this.age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getEmail() {
//        return this.email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    @Override
    public String toString() {
        return "Registration info: username: " + this.username + " password: " + this.password;
}
}
