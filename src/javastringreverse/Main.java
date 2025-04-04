package javastringreverse;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

    public static String isPalindrome(String originalString) {
        StringBuilder reverseString = new StringBuilder();

        for (int i = 0; i < originalString.length(); i++) {
            reverseString.append(originalString.charAt((originalString.length() - 1) - i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) != reverseString.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome ? "Yes" : "No";
    }
}
