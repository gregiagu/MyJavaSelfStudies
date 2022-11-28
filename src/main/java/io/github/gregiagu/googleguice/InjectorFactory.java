package io.github.gregiagu.googleguice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class InjectorFactory {

    private static final Injector instance = Guice.createInjector();

    public static synchronized Injector getInstance() {
        return instance;
    }
}
