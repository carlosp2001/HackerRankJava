package javabiginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        scanner.close();
        sumAndMultiplyTwoBigIntegers(n1, n2);
    }

    public static void sumAndMultiplyTwoBigIntegers(String n1, String n2) {
        BigInteger number1 = new BigInteger(n1);
        BigInteger number2 = new BigInteger(n2);
        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
    }
}
