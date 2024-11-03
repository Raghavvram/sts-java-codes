import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            String[] word = new String[r];
            for (int i = 0; i < r; i++) {
                word[i] = sc.next();
            }
            System.out.println(solution(word, r, c));
        }
        sc.close();
    }

    public static String solution(String[] word, int row, int col) {
        for (int i = 0; i < row; i++) {
            String str = word[i];
            str = str.toLowerCase();
            if (str.contains("spoon")) {
                return "There is a spoon!";
            }
        }
        for (int j = 0; j < col; j++) {
            StringBuilder str = new StringBuilder();
            for (int k = 0; k < row; k++) {
                str.append(word[k].charAt(j));
            }
            String s = str.toString().toLowerCase();
            if (s.contains("spoon"))
                return "There is a spoon!";
        }
        return "There is indeed no spoon!";
    }
}