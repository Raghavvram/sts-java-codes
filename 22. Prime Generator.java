import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void prime(int m, int n) {
        for (int i = m; i <= n; i++) {
            if (i <= 1)
                continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (; T > 0; T--) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            prime(m, n);
        }

    }
}
