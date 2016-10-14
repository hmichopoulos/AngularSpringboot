package eu.hmichopoulos.example.ui.rest.controller;

public class PrincipalDto {

    private boolean authenticated = false;
    private String username;

    public PrincipalDto(boolean authenticated, String username) {
        this.authenticated = authenticated;
        this.username = username;
    }

    public PrincipalDto() {
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public String getUsername() {
        return username;
    }
}
