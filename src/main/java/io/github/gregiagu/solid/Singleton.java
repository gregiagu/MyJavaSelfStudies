package io.github.gregiagu.solid;

import java.util.Date;

public class Singleton {

    private static final Singleton instance = new Singleton();
    private static final Long timestamp = new Date().getTime();

    private Singleton() {}

    public static synchronized Singleton getInstance(){
        return instance;
    }

    public static synchronized Long getTimestamp() {
        return timestamp;
    }
}
