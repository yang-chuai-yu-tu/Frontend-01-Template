import java.util.Deque;
import java.util.LinkedList;

public class NO_239 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
             int n = nums.length;
                int[] res = new int[n - k + 1];
                Deque<Integer> deque = new LinkedList<>();
                for(int i = 0; i < n; i++){
                    //last是最新进来的，first是最老进来的，这里老的是最大值，要依次把新的小的踢掉
                    while(!deque.isEmpty() && deque.peekLast() < nums[i]) deque.pollLast();
                    //一定要先offer不然都踢没了deque空了没first了
                    deque.offer(nums[i]);
                    if(i >= k - 1){
                        res[i - k + 1] = deque.peekFirst();
                        if(nums[i - k + 1] == deque.peekFirst()) deque.pollFirst();
                    }
                }
                return res;
        }
    }
}