package io.github.gregiagu.solid;

public class ConcreteClass extends HeritageClass {
    private String message;

    public ConcreteClass(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
