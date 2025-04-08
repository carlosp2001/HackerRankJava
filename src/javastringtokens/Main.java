package javastringtokens;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // Write your code here.
        System.out.println(countNumberOfTokensInAString("He is a very very good boy, isn't he?"));
    }

    public static int countNumberOfTokensInAString(String s) {
        String[] arrayOfStrings = s.split("[ !,?._'@]+");
        String[] newStrings = Arrays.stream(arrayOfStrings).filter(str -> !str.isEmpty()).toArray(String[]::new);
        return newStrings.length;
    }
}
