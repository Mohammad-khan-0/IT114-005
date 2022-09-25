package Homework_2;

import java.util.Arrays;

public class problem3 {
    public static void main(String[] args) {
        //Don't edit anything here
        Integer[] a1 = new Integer[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        Integer[] a2 = new Integer[]{-1, 1, -2, 2, 3, -3, -4, 5};
        Double[] a3 = new Double[]{-0.01, -0.0001, -.15};
        String[] a4 = new String[]{"-1", "2", "-3", "4", "-5", "5", "-6", "6", "-7", "7"};
        
        bePositive(a1);
        bePositive(a2);
        bePositive(a3);
        bePositive(a4);
    }
    /**
     * @param <T>
     * @param arr
     */
    static <T> void bePositive(T[] arr){
        System.out.println("Processing Array:" + Arrays.toString(arr));
        //your code should set the indexes of this array
        Object[] output = new Object[arr.length];

        //TODO convert each value to positive
        //set the result to the proper index of the output array
        //hint: don't forget to handle the data types properly
        
        
        
            if( arr instanceof Double[]){
            
                for(int j = 0; j < arr.length; j++){
                Double temp=(Double)(arr[j]);
               if (temp < 0){
                output[j] = temp * -1;
               }
               else{
                output[j] = temp;
               }
            
            }
          
         }
            if( arr instanceof Integer[]){
            
            for(int j = 0; j < arr.length; j++){
            int temp=(int)(arr[j]);
            if (temp < 0){
            output[j] = temp * -1;
           }
           else{
            output[j] = temp;
           }
        
        }
      
     }

     if( arr instanceof String[]){
            
        for(int j = 0; j < arr.length; j++){
       String temp=(String)(arr[j]);
       int num = Integer.parseInt(temp);
       if (num < 0){
        String ans = Integer.toString(num*-1);
        output[j] = ans;
       }
       else{
        output[j] = temp;
       }
    
    }
  
 }



        //end edit section

        StringBuilder sb = new StringBuilder();
        for(Object i : output){
            if(sb.length() > 0){
                sb.append(",");
            }
            sb.append(String.format("%s (%s)", i, i.getClass().getSimpleName().substring(0,1)));
        }
        System.out.println("Result: " + sb.toString());
    }
}
