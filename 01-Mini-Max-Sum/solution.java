import java.io.*;
import java.util.*;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        int min = arr.get(0);
        int max = arr.get(0);

        for (int num : arr) {
            total += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<>();

        String[] input = bufferedReader.readLine()
                .trim()
                .split(" ");

        for (String value : input) {
            arr.add(Integer.parseInt(value));
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
