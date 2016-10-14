package eu.hmichopoulos.example.ui.rest.controller;

public class GreetingDto {
    private String greeting;

    public GreetingDto(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
