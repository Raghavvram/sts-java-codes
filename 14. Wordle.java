import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class CodeChef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            String firstString = scanner.next();
            String secondString = scanner.next();
            StringBuilder result = new StringBuilder();

            for (int j = 0; j < 5; j++) {
                if (firstString.charAt(j) == secondString.charAt(j)) {
                    result.append("G");
                } else {
                    result.append("B");
                }
            }
            System.out.println(result.toString());
        }
        scanner.close();
    }
}
