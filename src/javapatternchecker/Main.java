package javapatternchecker;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkPatternCompilation("Test"));
    }

    public static String checkPatternCompilation(String pattern) {
        try {
            Pattern.compile(pattern);
            return "Valid";
        } catch (PatternSyntaxException exception) {
            return "Invalid";
        }
    }
}
