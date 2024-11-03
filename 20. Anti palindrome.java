import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] charCount = new int[26]; // Changed size to 26 for all lowercase letters
            for (int i = 0; i < n; i++) {
                charCount[s.charAt(i) - 'a']++;
            }
            Arrays.sort(charCount);

            int oddCount = 0;
            int evenCount = 0;

            for (int i = 25; i >= 0; i--) {
                if (charCount[i] == 0) {
                    break;
                } else if (charCount[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            if (n % 2 == 0) {
                if (oddCount > 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else {
                if (oddCount > 1) {
                    System.out.println(0);
                } else if (oddCount == 1) {
                    if (evenCount == 0) {
                        System.out.println(2);
                    } else {
                        System.out.println(1);
                    }
                }
            }
        }

        sc.close();
    }
}
