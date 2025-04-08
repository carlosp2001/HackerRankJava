package javapatternchecker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {
    @Test
    public void testCheckPatternCompilationHappyPath() {
        assertEquals("Valid", Main.checkPatternCompilation("([A-Z])(.+)"));
    }

    @Test
    public void testCheckPatternCompilationHappyPath2() {
        assertEquals("Invalid", Main.checkPatternCompilation("[AZ[a-z](a-z)"));
    }

    @Test
    public void testCheckPatternCompilationChaosPath() {
        assertEquals("Invalid", Main.checkPatternCompilation("batcatpat(nat"));
    }

}
