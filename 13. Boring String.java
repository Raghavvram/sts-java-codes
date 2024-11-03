import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class CodeChef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int stringLength = scanner.nextInt();
            String inputString = scanner.next();

            int count = 1;
            int maxLength = 0;
            HashMap<String, Integer> stringCountMap = new HashMap<>();
            StringBuilder currentSubstring = new StringBuilder();

            for (int i = 0; i < stringLength - 1; i++) {
                if (inputString.charAt(i) == inputString.charAt(i + 1)) {
                    currentSubstring.append(inputString.charAt(i));
                    count++;
                } else {
                    currentSubstring.append(inputString.charAt(i));
                    stringCountMap.put(currentSubstring.toString(),
                            stringCountMap.getOrDefault(currentSubstring.toString(), 0) + 1);
                    maxLength = Math.max(maxLength, count);
                    count = 1;
                    currentSubstring = new StringBuilder();
                }
                if (i == stringLength - 2) {
                    currentSubstring.append(inputString.charAt(i + 1));
                    stringCountMap.put(currentSubstring.toString(),
                            stringCountMap.getOrDefault(currentSubstring.toString(), 0) + 1);
                    maxLength = Math.max(maxLength, count);
                }
            }

            int maxVal = 0;
            for (String key : stringCountMap.keySet()) {
                maxVal = Math.max(maxVal, key.length());
            }

            String result = "";
            for (String key : stringCountMap.keySet()) {
                if (stringCountMap.get(key) > 1 && key.length() == maxVal) {
                    result = key;
                }
            }

            if (result.length() == maxLength) {
                System.out.println(maxLength);
            } else {
                System.out.println(Math.max(result.length(), maxLength) - 1);
            }
        }
        scanner.close();
    }
}
