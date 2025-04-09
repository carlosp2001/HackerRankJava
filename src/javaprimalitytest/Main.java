package javaprimalitytest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        System.out.println(isPrime(n));

        bufferedReader.close();
    }

    public static String isPrime(String n) {
        try {
            BigInteger bI = new BigInteger(n);
            boolean result = bI.isProbablePrime(1);
            return result ? "prime" : "not prime";
        } catch (Exception e) {
            return "not prime";
        }
    }
}
