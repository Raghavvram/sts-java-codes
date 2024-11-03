import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String st = sc.next();
            System.out.println(findLongestSubstring(st));
        }
        sc.close();
    }

    public static int findLongestSubstring(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            charCount.put(endChar, charCount.getOrDefault(endChar, 0) + 1);

            while (charCount.get(endChar) > getMaxOccurrences(endChar)) {
                char startChar = s.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static int getMaxOccurrences(char ch) {
        return ch - 'a' + 1; // Calculate f(β)
    }
}
