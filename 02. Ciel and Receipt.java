import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int p = scanner.nextInt();
            int count = 0;
            for (int i = 11; i >= 0; i--) {
                int price = (1 << i);
                if (p >= price) {
                    count += p / price;
                    p %= price;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}