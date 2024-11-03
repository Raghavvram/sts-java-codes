import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class CodeChef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String binaryString = Integer.toBinaryString(number);
        int length = binaryString.length();
        StringBuilder newBinaryString = new StringBuilder();

        char rightmostBit = binaryString.charAt(length - 1);
        newBinaryString.append(rightmostBit == '1' ? '0' : '1');

        for (int i = 1; i < length - 1; i++) {
            newBinaryString.append(binaryString.charAt(i));
        }

        char leftmostBit = binaryString.charAt(0);
        newBinaryString.append(leftmostBit == '1' ? '0' : '1');

        int result = Integer.parseInt(newBinaryString.toString(), 2);
        System.out.println(result);

        scanner.close();
    }
}
