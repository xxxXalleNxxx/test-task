package ru.arapov.testtask.models;

public class LoginResponseDTO {

    private ApplicationUser user;
    private String password;

    public LoginResponseDTO() {
        super();
    }

    public LoginResponseDTO(ApplicationUser user, String password) {
        this.user = user;
        this.password = password;
    }

    public ApplicationUser getUser() {
        return this.user;
    }

    public void setUser(ApplicationUser user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
