package org.adhyan.hackerrank.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int count=0;
    	for(int i=1;i<=arr.length;i++) {
    		
    		if(i!=arr[i-1]) {
    			int index1 = i-1;
    			int index2 = 0;
    		   for(int j=i+1;j<=arr.length;j++) {
    			   
    			   if(i==arr[j-1]) {
    				   index2 = j-1;
    				   break;
    			   }
    		   }
    		   int temp = arr[index1];
    		   arr[index1] = arr[index2];
    		   arr[index2] = temp;
    		   count++;
    		}	
    	}	
      return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
  
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
         System.out.println("Result = "+res);
        scanner.close();
    }
}