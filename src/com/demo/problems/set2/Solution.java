package com.demo.problems.set2;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;



class Result {

    /*
     * Complete the 'droppedRequests' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY requestTime as parameter.
     */

    public static int droppedRequests(List<Integer> requestTime) {
    int[][] limits = {{1, 3}, {10, 20}, {60, 60}};

    int res = 0;
    Map<Integer, Integer> map = new HashMap<>();
    int max = Integer.MIN_VALUE;

    for(int i : requestTime) {
        map.put(i, map.getOrDefault(i, 0) + 1);
        max = Math.max(max, i);
    }

    int[] nums = new int[max+1];
    for(int key : map.keySet()) {
        nums[key] = map.get(key);
    }
    
    int[] preSum = new int[nums.length];
    for(int i=1;i<nums.length;i++) {
        preSum[i] = preSum[i-1] + nums[i];
    }
    
    for(int[] limit : limits) {
        int time = Math.min(limit[0], preSum.length-1);
        int maxCnt = limit[1];
        for(int i=0;i<preSum.length-time;i++) {
            int cur = preSum[i+time] - preSum[i];
            res += cur > maxCnt ? cur - maxCnt : 0;
        }
    }
    return res;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int requestTimeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> requestTime = IntStream.range(0, requestTimeCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.droppedRequests(requestTime);
        
        System.out.println("dropped="+result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();*/

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
