import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class CodeChef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int length = scanner.nextInt();
            StringBuilder s = new StringBuilder(scanner.next().substring(0, length));
            boolean canBeEmpty = true;

            for (int i = 0; i < length; i++) {
                int count = 1;
                for (int j = 0; j < length; j++) {
                    if (i != j) {
                        if (s.charAt(i) == s.charAt(j)) {
                            count++;
                            s.deleteCharAt(j);
                            j--;
                            length--;
                        }
                    }
                }
                if (count % 2 != 0) {
                    canBeEmpty = false;
                } else {
                    s.deleteCharAt(i);
                    i--;
                    length--;
                }
            }
            System.out.println(canBeEmpty ? "YES" : "NO");
        }
        scanner.close();
    }
}
