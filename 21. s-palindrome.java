import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "AbdHIMOopqTUVvWwXxY";
        String b = "AdbHIMOoqpTUVvWwXxY";
        Map<Character, Character> r = new HashMap<>();

        for (int p = 0; p < a.length(); p++) {
            r.put(a.charAt(p), b.charAt(p));
        }

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        boolean palindrome = true;
        for (int p = 0; p < s.length(); p++) {
            if (!r.containsKey(s.charAt(p)) || r.get(s.charAt(p)) != s.charAt(s.length() - p - 1)) {
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome ? "TAK" : "NIE");
    }
}
