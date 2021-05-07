import java.util.Arrays ;

public class Solution {

    public int[] sortedSquare(int[] nums) {
        for(int num = 0; num < nums.length; num++){
            nums[num] = nums[num] * nums[num] ;
        }
        Arrays.sort(nums) ;
        return nums ;
    }
    public static void main(String[] args) {
        Solution s = new Solution() ;
        int[] arr = {-7,-3,2,-3,11} ;

        int [] res = s.sortedSquare(arr) ;
        for(int i : res) {
            System.out.println(i);
        }
    }
    
}

/*
PS D:\javaPlayGround\Java_Blood_Lust\LeetCode\Squares of a Sorted Array> javac Solution.java
PS D:\javaPlayGround\Java_Blood_Lust\LeetCode\Squares of a Sorted Array> java Solution
4
9  
9  
49 
121
 */