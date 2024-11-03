import java.util.Scanner;
import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    private static void solve(Scanner scanner) {
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        BitSet b_b = BitSet.valueOf(new long[] { b });
        BitSet b_c = BitSet.valueOf(new long[] { c });
        BitSet b_d = BitSet.valueOf(new long[] { d });
        BitSet b_a = new BitSet(64);

        int[][][] mp = new int[2][2][2];
        mp[0][0][0] = 0;
        mp[0][1][0] = 0;
        mp[1][0][1] = 0;
        mp[1][1][1] = 0;
        mp[0][0][1] = 1;
        mp[1][1][0] = 1;
        mp[0][1][1] = -1;
        mp[1][0][0] = -1;

        for (int i = 0; i < 64; i++) {
            int b_b_i = b_b.get(i) ? 1 : 0;
            int b_c_i = b_c.get(i) ? 1 : 0;
            int b_d_i = b_d.get(i) ? 1 : 0;
            int chars = mp[b_b_i][b_c_i][b_d_i];
            if (chars == -1) {
                System.out.println(-1);
                return;
            } else {
                b_a.set(i, chars == 1);
            }
        }

        long result = b_a.toLongArray().length > 0 ? b_a.toLongArray()[0] : 0;
        System.out.println(result);
    }
}
