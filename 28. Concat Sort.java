import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    static long sumN = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            solve(scanner);
        }

        assert sumN <= 200000;
        scanner.close();
    }

    private static void solve(Scanner scanner) {
        int n = readIntLn(scanner, 2, 100000);
        sumN += n;

        int[] a = readVectorInt(scanner, n, 1, 1000000000);
        int[] b = Arrays.copyOf(a, a.length);
        Arrays.sort(b);

        List<Integer> rem = new ArrayList<>();
        int cur = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == b[cur]) {
                cur++;
            } else {
                rem.add(a[i]);
            }
        }

        if (isSorted(rem)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static int readIntLn(Scanner scanner, int l, int r) {
        int x = scanner.nextInt();
        assert l <= x && x <= r;
        return x;
    }

    private static int[] readVectorInt(Scanner scanner, int n, int l, int r) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = readIntLn(scanner, l, r);
        }
        return a;
    }
}
