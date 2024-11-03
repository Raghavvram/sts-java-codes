import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            freq.put(currentChar, freq.getOrDefault(currentChar, 0) + 1);

            while (freq.get(currentChar) > 1) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }

            longest = Math.max(longest, right - left + 1);
        }

        System.out.println(longest);
    }
}
