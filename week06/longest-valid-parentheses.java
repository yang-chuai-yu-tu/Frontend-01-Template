class Solution {
    public int longestValidParentheses(String s) {
        int res = 0, n = s.length();
        int[] dp = new int[n];
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == ')'){
                //普通的()
                if(s.charAt(i - 1) == '(') dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                //(())这种情况也要继承之前i - 1的长度，上一个'('前一个的长度
                else if(i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(')  dp[i] = dp[i - 1] + 
                (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0) + 2; 
            }
            else{
                dp[i] = 0;
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}