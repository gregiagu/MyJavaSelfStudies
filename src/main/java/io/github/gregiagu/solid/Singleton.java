package io.github.gregiagu.solid;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static synchronized Singleton getInstance(){
        return instance;
    }
}
