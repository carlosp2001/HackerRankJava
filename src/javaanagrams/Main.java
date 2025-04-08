package javaanagrams;

import java.util.Scanner;

public class Main {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        String stringALowerCase = a.toLowerCase();
        String stringBLowerCase = b.toLowerCase();

        // Declare flag variable
        boolean isAnagram = true;
        if (stringALowerCase.length() != stringBLowerCase.length()) isAnagram = false;
        else {
            for (int i = 0; i < stringALowerCase.length(); i++) {
                // Count number of times of the letter
                char currentCharacter = stringALowerCase.charAt(i);
                int numberOfTimesInA = 0;
                int numberOfTimeInB = 0;
                for (int y = 0; y < stringALowerCase.length(); y++) {
                    if (currentCharacter == stringALowerCase.charAt(y)) numberOfTimesInA++;
                }
                for (int y = 0; y < stringBLowerCase.length(); y++) {
                    if (currentCharacter == stringBLowerCase.charAt(y)) numberOfTimeInB++;
                }
                if (numberOfTimeInB != numberOfTimesInA) {
                    isAnagram = false;
                    break;
                }

            }

            for (int i = 0; i < stringBLowerCase.length(); i++) {
                // Count number of times of the letter
                char currentCharacter = stringBLowerCase.charAt(i);
                int numberOfTimesInA = 0;
                int numberOfTimeInB = 0;
                for (int y = 0; y < stringBLowerCase.length(); y++) {
                    if (currentCharacter == stringBLowerCase.charAt(y)) numberOfTimeInB ++;
                }
                for (int y = 0; y < stringALowerCase.length(); y++) {
                    if (currentCharacter == stringALowerCase.charAt(y)) numberOfTimesInA++;
                }
                if (numberOfTimeInB != numberOfTimesInA) {
                    isAnagram = false;
                    break;
                }

            }
        }

        return isAnagram;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
