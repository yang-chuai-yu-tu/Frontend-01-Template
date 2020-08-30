public class NO_189{
  
  class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int count = 0;
        for(int start = 0; count < len; start++){
            int cur = start;
            int pre = nums[cur];
            do{
                int next = (cur + k) % len;
                int tmp = nums[next];
                nums[next] = pre;
                pre = tmp;
                cur = next;
                count++;
            }while(cur != start);
        }
    }
}
  
  }