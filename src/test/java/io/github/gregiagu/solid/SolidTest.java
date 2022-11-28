package io.github.gregiagu.solid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolidTest {

    @Test
    public void singletonReferencesShouldBePointTotTheSameObject() {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();
        assertEquals(firstInstance.hashCode(), secondInstance.hashCode());
    }

    @Test
    public void singletonTimestampShouldBeEquals() {
        Singleton firstInstance = Singleton.getInstance();
        assertEquals(firstInstance.getTimestamp(), Singleton.getTimestamp());
    }
}
