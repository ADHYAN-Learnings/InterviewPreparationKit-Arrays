package org.adhyan.hackerrank.arrays;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ArrayManipulation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        int[] query = new int[n+1];
        IntStream.range(0,m).forEach(i->{
        try {
          String[] data = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
          query[Integer.parseInt(data[0])-1] +=Integer.parseInt(data[2]);
          query[Integer.parseInt(data[1])] -=Integer.parseInt(data[2]);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });       
        long sum  = 0;
        long result = 0;
        for(int i=0;i<n;i++){
            sum += query[i];
            result = Math.max(sum,result);
        }
        System.out.println(result);
        bufferedReader.close();
    }
}
