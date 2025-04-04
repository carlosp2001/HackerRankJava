package javastringreverse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testIsPalindromeHappyPath() {
        assertEquals("Yes", Main.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindromeFailPath() {
        assertEquals("No", Main.isPalindrome("spider"));
    }

}
