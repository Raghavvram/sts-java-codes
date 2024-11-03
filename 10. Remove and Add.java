import java.lang.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")

class Range {
    int start, end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class CodeChef {

    // Function to find the maximum length of subarray with unique elements
    public static Range findMaxUniqueSubarray(int[] array, int length) {
        HashMap<Integer, Integer> lastIndexMap = new HashMap<>();
        int maxLength = 0, startIndex = -1, endIndex = -1;

        for (int i = 0, j = 0; i < length; i++) {
            if (lastIndexMap.containsKey(array[i])) {
                j = Math.max(lastIndexMap.get(array[i]), j);
            }
            if ((i - j + 1) >= maxLength) {
                if ((i - j + 1) == maxLength) {
                    if (i == (length - 1) || j == 0) {
                        maxLength = i - j + 1;
                        startIndex = i;
                        endIndex = j;
                    }
                } else {
                    maxLength = i - j + 1;
                    startIndex = i;
                    endIndex = j;
                }
            }
            lastIndexMap.put(array[i], i + 1);
        }
        return new Range(startIndex, endIndex);
    }

    // Function to find the minimum number of operations
    public static int findMinOperations(int[] array, int length) {
        Range range = findMaxUniqueSubarray(array, length);
        int start = range.end;
        int end = range.start;
        return 2 * Math.min(start, length - end - 1) + Math.max(start, length - end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int size = scanner.nextInt();
            int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println(findMinOperations(array, size));
        }
        scanner.close();
    }
}
