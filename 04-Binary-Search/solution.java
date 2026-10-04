import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static int introTutorial(int V, List<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) == V) {
                return mid;
            } else if (arr.get(mid) < V) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int V = Integer.parseInt(bufferedReader.readLine().trim());

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(
                bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" ")
        )
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        int result = Result.introTutorial(V, arr);

        System.out.println(result);

        bufferedReader.close();
    }
}
