import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v1 = new int[n];
        int[] pre = new int[n];
        int[] suf = new int[n];

        for (int i = 0; i < n; i++) {
            v1[i] = scanner.nextInt();
        }

        pre[0] = v1[0];
        for (int i = 1; i < n; i++) {
            pre[i] = gcd(v1[i], pre[i - 1]);
        }

        suf[n - 1] = v1[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = gcd(v1[i], suf[i + 1]);
        }

        int fans = Math.max(suf[1], pre[n - 2]);
        for (int i = 1; i < n - 1; i++) {
            fans = Math.max(fans, gcd(pre[i - 1], suf[i + 1]));
        }

        System.out.println(fans);
        scanner.close();
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
