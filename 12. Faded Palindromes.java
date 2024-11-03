import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class CodeChef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            String inputString = scanner.next();
            System.out.println(isValidPalindrome(inputString));
        }

        scanner.close();
    }

    public static String isValidPalindrome(String inputString) {
        char[] charArray = inputString.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length / 2; i++) {
            char leftChar = charArray[i];
            char rightChar = charArray[length - i - 1];

            if (leftChar == '.' && rightChar == '.') {
                charArray[i] = 'a';
                charArray[length - i - 1] = 'a';
            } else if (leftChar == '.') {
                charArray[i] = rightChar;
            } else if (rightChar == '.') {
                charArray[length - i - 1] = leftChar;
            } else if (leftChar != rightChar) {
                return "-1";
            }
        }

        if (length % 2 == 1 && charArray[length / 2] == '.') {
            charArray[length / 2] = 'a';
        }

        return new String(charArray);
    }
}
