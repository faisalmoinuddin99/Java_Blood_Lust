/*
@DESC: Find Numbers with Even Number of Digits
*/
import java.io.*;
import java.util.*;

public class Test {

    public int findNumbers(int[] nums) {
        int count = 0;
        
        int evenNumber = 0;
        for(int i = 0; i < nums.length; i++){
           while(nums[i] != 0){
                nums[i] /= 10;
                ++count ;
            }
            
            if(count % 2 == 0){
                evenNumber += 1;
            }

           

        }
       
        return evenNumber ;

    }

    public static void main(String[] args) {
        Test t = new Test() ;
        int[] arr = {12,345,2,6,7896};
        System.out.println( t.findNumbers(arr) ) ;
       
    }
    

}