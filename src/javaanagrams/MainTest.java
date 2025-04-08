package javaanagrams;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void testIsAnagramHappyPath() {
        assertTrue(Main.isAnagram("anagram", "margana"));
    }

    @Test
    public void testIsAnagramChaosPath() {
        assertFalse(Main.isAnagram("anagram", "andana"));
    }

    @Test
    public void testIsAnagramChaosPat2() {
        assertFalse(Main.isAnagram("anagramm", "marganaa"));
    }
}
