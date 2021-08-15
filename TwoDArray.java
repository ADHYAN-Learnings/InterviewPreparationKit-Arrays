package org.adhyan.hackerrank.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result1 {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    	
     int  maximumValue = Integer.MIN_VALUE;	
     int  sum = 0;
     for(int i=1;i<5;i++) {
    	 for(int j=1;j<5;j++) {
    		 sum = arr.get(i).get(j) + 
    			   arr.get(i-1).get(j) + arr.get(i-1).get(j-1) + arr.get(i-1).get(j+1) + 
    			   arr.get(i+1).get(j-1) + arr.get(i+1).get(j) + arr.get(i+1).get(j+1);
    		
              if(maximumValue<sum) {
            	  maximumValue = sum;
              }	 
    	 }
     }
     return maximumValue;
    }
}

public class TwoDArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     

        List<List<Integer>> arr = new ArrayList<>();
       /*  After running the code input should be given like this.
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
        */
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result1.hourglassSum(arr);
        System.out.println("result = "+result);
    }
}

