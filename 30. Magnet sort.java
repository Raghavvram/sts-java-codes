import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    static final int MAX = 200007;
    static final int MOD = 1000000007;

    public static void solve(Scanner in) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        String s = in.next();

        if (isSorted(a)) {
            System.out.println(0);
            return;
        }

        boolean hasN = false, hasS = false;
        for (char c : s.toCharArray()) {
            if (c == 'N')
                hasN = true;
            if (c == 'S')
                hasS = true;
        }

        if (!hasN || !hasS) {
            System.out.println(-1);
            return;
        }

        if (s.charAt(0) != s.charAt(n - 1)) {
            System.out.println(1);
            return;
        }

        int[] sorted = Arrays.copyOf(a, n);
        Arrays.sort(sorted);
        boolean seen = false;

        for (int i = 0; i < n; i++) {
            if (sorted[i] == a[i]) {
                if (s.charAt(i) != s.charAt(0))
                    seen = true;
            } else if (i == 0 || sorted[i - 1] == a[i - 1]) {
                if (s.charAt(i) != s.charAt(0))
                    seen = true;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (sorted[i] == a[i]) {
                if (s.charAt(i) != s.charAt(n - 1))
                    seen = true;
            } else if (i == n - 1 || sorted[i + 1] == a[i + 1]) {
                if (s.charAt(i) != s.charAt(n - 1))
                    seen = true;
                break;
            }
        }

        if (seen) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tt = in.nextInt();
        for (int i = 1; i <= tt; i++) {
            solve(in);
        }
        in.close();
    }
}
