package javasubstringcomparisons;

import java.util.Scanner;

public class Main {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        int stringLength = s.length();
        String[] substringsCombination = new String[stringLength];
        for (int i = 0; i < stringLength; i++) {
            if (i + k > stringLength) break;
            substringsCombination[i] = s.substring(i, i + k);
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < substringsCombination.length; i++) {
            if (i == 0) {
                largest = substringsCombination[i];
                smallest = substringsCombination[i];
                continue;
            }
            if (substringsCombination[i] != null && largest.compareTo(substringsCombination[i]) < 0) largest = substringsCombination[i];
            if (substringsCombination[i] != null && smallest.compareTo(substringsCombination[i]) > 0) smallest = substringsCombination[i];
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
