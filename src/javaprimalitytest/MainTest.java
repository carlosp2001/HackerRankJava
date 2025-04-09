package javaprimalitytest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void isPrimeHappyPath() {
        assertEquals("prime", Main.isPrime("13"));
    }


    @Test
    public void isPrimeChaosPath() {
        assertEquals("not prime", Main.isPrime("4"));
    }
}
