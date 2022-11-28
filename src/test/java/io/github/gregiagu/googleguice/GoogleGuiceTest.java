package io.github.gregiagu.googleguice;

import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoogleGuiceTest {

    @Test
    public void guiceInjectorShouldBeSingletons() {
        Injector firstInstance = InjectorFactory.getInstance();
        Injector secondInstance = InjectorFactory.getInstance();
        assertEquals(firstInstance.hashCode(), secondInstance.hashCode());
    }
}
