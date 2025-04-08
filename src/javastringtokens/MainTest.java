package javastringtokens;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void testCountNumberOfTokensInAString() {
        assertEquals(10, Main.countNumberOfTokensInAString("He is a very very good boy, isn't he?"));
    }

    @Test
    public void testCountNumberOfTokensInAString2() {
        assertEquals(8, Main.countNumberOfTokensInAString("           YES      leading spaces        are valid,    problemsetters are         evillllll"));
    }
}
