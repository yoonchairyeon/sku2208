package s;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;


class Result {

    /*
     * Complete the 'balancedSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int balancedSum(List<Integer> arr) {
    // Write your code here
       int leftptr = 0; 
       int rightptr = arr.size()-1;   
       int left_sum = arr.get(leftptr);
       int right_sum = arr.get(rightptr); 
       while(rightptr - leftptr != 2) 
       {
           if(left_sum <= right_sum){ 
               leftptr++;
               left_sum = left_sum + arr.get(leftptr);
           }
           else{ 
               rightptr--;
               right_sum = right_sum + arr.get(rightptr);
           }
       }
       if(left_sum == right_sum) 
           return (leftptr+1);
       else
           return -1;
   }
}

public class Solution {
  public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount= Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> arr  = IntStream.range(0, arrCount).mapToObj(i ->{
        	try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
        }).map(String::trim)
          .map(Integer::parseInt)
          .collect(toList());
        

        int result = Result.balancedSum(arr);
        
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

