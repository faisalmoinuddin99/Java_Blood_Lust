public class Test2 {

 public int findNumbers(int[] nums) {
        int count = 0 ;
        for(int num : nums){
            count += String.valueOf(num).length() % 2 == 0 ? 1 : 0 ;
        }
        return count ;
 }

    public static void main(String[] args) {
        Test2 t = new Test2();
         int[] arr = {555,901,482,1771};
        System.out.println( t.findNumbers(arr) ) ;
        
    }
    
    

}