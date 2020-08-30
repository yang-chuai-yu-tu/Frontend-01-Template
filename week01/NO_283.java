public class NO_283 {

    class Solution {
        public void moveZeroes(int[] nums) {
            int idx = 0;
            for (int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    nums[idx] = nums[i];
                    if(i > idx) nums[i] = 0;
                    idx++;
                }
            }
        }
    }
    
}