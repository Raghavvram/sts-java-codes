import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        max = sum;
        for (int i = K; i < N; i++) {
            sum = sum - arr[i - K] + arr[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
        sc.close();
    }
}
