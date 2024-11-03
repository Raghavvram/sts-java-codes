import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();

            int ans = Integer.MIN_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                if (i + k < n) {
                    A[i] += A[i + k];
                }
                ans = Math.max(ans, A[i]);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}