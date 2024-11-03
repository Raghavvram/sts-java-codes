import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class Codechef {
    private static int computeGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int arraySize = scanner.nextInt();
            int[] numbers = new int[arraySize];

            for (int i = 0; i < arraySize; i++) {
                numbers[i] = scanner.nextInt();
            }

            int overallGCD = numbers[0];
            for (int i = 1; i < arraySize; i++) {
                overallGCD = computeGCD(overallGCD, numbers[i]);
                if (overallGCD == 1) {
                    break;
                }
            }

            if (overallGCD == 1) {
                System.out.println(arraySize);
            } else {
                System.out.println(-1);
            }
        }
        scanner.close();
    }
}
