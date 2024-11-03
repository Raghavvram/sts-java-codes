import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    public static int getMsbPos(int num) {
        int index = 0;
        while (num > 0) {
            num /= 2;
            index++;
        }
        return index;
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int num;
        List<int[]> prefix = new ArrayList<>();
        int[] counts = new int[32];
        prefix.add(counts.clone());

        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            int pos = getMsbPos(num);
            counts[pos]++;
            prefix.add(counts.clone());
        }

        int q = sc.nextInt();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int pos = getMsbPos(x);
            int result = (r - l + 1) - (prefix.get(r)[pos] - prefix.get(l - 1)[pos]);
            output.append(result).append("\n");
        }

        System.out.print(output);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}
