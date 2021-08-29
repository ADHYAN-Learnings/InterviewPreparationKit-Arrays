package org.adhyan.hackerrank.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
      
   
    	 
   /* 	 Java 8 implementation
    	 int  count =   IntStream.iterate(q.size(), n->n-1).limit(q.size()).map(i->{
    		               if(q.get(i-1)!=i) {
       		  
       		                 if((i-2)>=0 && q.get(i-2)==i){
       			             int swap1 = q.get(i-1);
       			             int swap2 = q.get(i-2);
       			             q.set(i-1, swap2);
       			             q.set(i-2, swap1);
       			             return 1;
       			             
       		                 } else if((i-3) >= 0 && q.get(i-3)==i) {
       			             int swap1 = q.get(i-1);
       			             int swap2 = q.get(i-2);
       			             int swap3 = q.get(i-3);
       			  
       			             q.set(i-1, swap3);
       			             q.set(i-2, swap1);
       			             q.set(i-3, swap2);
       			             return 2;
       		                  } else {
       		                	  return -1000001;
       		                  }
    		               }
       		               return 0;

    		      	   }).sum();  
    	
   System.out.println(count>-1?count:"Too chaotic"); */
    	
    // successfull completion	
    	int count = 0;
    	boolean flag = false;
    	for(int i=q.size();i>=1;--i) {
    	  if(q.get(i-1)!=i) {
    		  
    		  if((i-2)>=0 && q.get(i-2)==i){
    			  int swap1 = q.get(i-1);
    			  int swap2 = q.get(i-2);
    			  q.set(i-1, swap2);
    			  q.set(i-2, swap1);
    			  count++;
    		  } else if((i-3) >= 0 && q.get(i-3)==i) {
    			  int swap1 = q.get(i-1);
    			  int swap2 = q.get(i-2);
    			  int swap3 = q.get(i-3);
    			  
    			  q.set(i-1, swap3);
    			  q.set(i-2, swap1);
    			  q.set(i-3, swap2);
    			 count+=2;
    		  } else {
    			  flag = true;
    			  break;
    		  }
    	
    		 } 
    	  }  
    	System.out.println(flag?"Too chaotic":count);
    } 
}

public class NewYearChaos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Result3.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
