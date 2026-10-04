import java.io.*;
import java.util.*;

class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Collections.max(candles);
        int count = 0;

        for (int candle : candles) {
            if (candle == max) {
                count++;
            }
        }

        return count;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] input = bufferedReader.readLine()
                .trim()
                .split(" ");

        List<Integer> candles = new ArrayList<>();

        for (String value : input) {
            candles.add(Integer.parseInt(value));
        }

        int result = Result.birthdayCakeCandles(candles);

        System.out.println(result);

        bufferedReader.close();
    }
}
