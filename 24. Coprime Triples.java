import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    private static final int MAX_A = 1000000;
    private static int[] frequency = new int[MAX_A + 1];
    private static long[] gcdCount = new long[MAX_A + 1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();

        for (int i = 0; i < numberCount; i++) {
            int number = scanner.nextInt();
            frequency[number]++;
        }
        scanner.close();

        for (int gcd = MAX_A; gcd >= 1; gcd--) {
            int multiples = 0;

            for (int multiple = gcd; multiple <= MAX_A; multiple += gcd) {
                multiples += frequency[multiple];
            }

            if (multiples >= 3) {
                gcdCount[gcd] = (long) multiples * (multiples - 1) * (multiples - 2) / 6;
            }

            for (int multiple = 2 * gcd; multiple <= MAX_A; multiple += gcd) {
                gcdCount[gcd] -= gcdCount[multiple];
            }
        }

        System.out.println(gcdCount[1]);
    }
}
