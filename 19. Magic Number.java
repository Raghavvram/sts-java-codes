import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();

        if (isMagicNumber(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isMagicNumber(String num) {
        int i = 0;
        int length = num.length();

        while (i < length) {
            if (i + 2 < length && num.substring(i, i + 3).equals("144")) {
                i += 3;
            } else if (i + 1 < length && num.substring(i, i + 2).equals("14")) {
                i += 2;
            } else if (num.charAt(i) == '1') {
                i += 1;
            } else {
                return false;
            }
        }
        return true;
    }
}
