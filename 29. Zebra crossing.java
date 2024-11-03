import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tt = in.nextInt();
        while (tt-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int j = 1;
            String s = in.next();
            char c = k % 2 == s.charAt(0) - '0' ? '0' : '1';
            while (j < n && k > 0) {
                if (s.charAt(j) != s.charAt(j - 1)) {
                    k--;
                }
                j++;
            }
            System.out.println(k == 0 ? s.lastIndexOf(c) + 1 : -1);
        }
        in.close();
    }
}
