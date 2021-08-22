package org.adhyan.hackerrank.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

class Result2 {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
    List<Integer> data = new ArrayList<Integer>(a.size());
    int arraySize = a.size();
    int actualRotation = d%arraySize;
    
     IntStream.range(0, a.size()).forEach(i->{
    	int index = ((i+actualRotation)%arraySize);
    	data.add(a.get(index));
    }); 
  
      return data;
    }

}

public class Arrays_LeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      
         /*  5 4
          *  1 2 3 4 5
          * 
          */
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);
        
        System.out.println(n+"   "+d);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result2.rotLeft(a, d);
        System.out.println(" Result : "+result);

        

        bufferedReader.close();
    }
}

