/*
@DESC: find the maximum number of consecutive 1s in this array
*/

public class Test {

    public int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to 
        // keep track of how many 1's you've seen in a row.
        int trackOfOnes = 0 ;
        int max_consecutive_ones = 0;
        for (int i = 0; i < nums.length; i++) {
            // Do something with element nums[i].
            if(nums[i] == 1){
                trackOfOnes += 1;
            }
            else{
                trackOfOnes = 0 ;
            }
            if(max_consecutive_ones < trackOfOnes) {
                max_consecutive_ones = trackOfOnes ;
            }

        }

        return max_consecutive_ones ;
    }
    public static void main(String[] args) {
        Test t = new Test() ;
        int[] num = { 1,0,1,1,0,1} ;
       int result = t.findMaxConsecutiveOnes(num);
        System.out.println(result);
    }
    
}