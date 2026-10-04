import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);

        int count = 0;
        int total = 0;

        for (int price : prices) {
            if (total + price <= k) {
                total += price;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> prices = Stream.of(
                bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" ")
        )
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        int result = Result.maximumToys(prices, k);

        System.out.println(result);

        bufferedReader.close();
    }
}
