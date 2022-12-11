package io.github.gregiagu.solid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertEquals(Singleton.getTimestamp(), Singleton.getTimestamp());
    }

    @Test
    public void verifyLiskovSubstitution() {
        ConcreteClass cc = new ConcreteClass("Message in blood");
        HeritageClass hc = cc;
        assertEquals(cc.hashCode(), hc.hashCode());
        assertTrue(hc instanceof ConcreteClass);
    }
}