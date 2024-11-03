import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef {
    public static long findMinSumSubarray(long n, long k, long[] arr) {
        long min = Long.MAX_VALUE;

        for (long i = 0; i <= n - k; i++) {
            long sum = 0;
            for (long j = i; j < i + k; j++) {
                sum += arr[(int) j];
            }
            min = Math.min(min, sum);
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long[] arr = new long[(int) n];
        for (long i = 0; i < n; i++) {
            arr[(int) i] = scanner.nextLong();
        }
        scanner.close();
        System.out.println(findMinSumSubarray(n, k, arr));
    }
}
