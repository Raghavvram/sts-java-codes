import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int Q = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            Arrays.sort(A);
            long[] tripletCounts = new long[N - 2];
            long totalTriplets = 0;

            for (int i = 0; i < N - 2; i++) {
                long count = (long) (N - i - 1) * (N - i - 2) / 2;
                totalTriplets += count;
                tripletCounts[i] = totalTriplets;
            }

            for (int q = 0; q < Q; q++) {
                long K = scanner.nextLong();
                int index = binarySearchTripletCount(tripletCounts, K);
                output.append(A[index]).append("\n");
            }
        }

        System.out.print(output);
        scanner.close();
    }

    private static int binarySearchTripletCount(long[] tripletCounts, long K) {
        int left = 0, right = tripletCounts.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (tripletCounts[mid] >= K) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
