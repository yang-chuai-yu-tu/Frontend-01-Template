class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        if(n * m == 0) return n + m;
        for(int i = 0; i <= m; i++){
            dp[i][0] = i;
        }
        for(int i = 0; i <= n; i++){
            dp[0][i] = i;
        }
        for(int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                //Word1的前i个字符变成word2的前j个字符的步骤数
                //等于word1或者word2去掉一个字符的步数+1（添加一个字符）
                dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]),
                //或者等于同时去掉最后一个字符的步数+1（改最后一个字符改成一样），如果是一样的不用改所以少一步
                word1.charAt(i - 1) == word2.charAt(j - 1) ? dp[i - 1][j - 1] - 1 : dp[i - 1][j - 1]);
            }
        }
        return dp[m][n];
    }
}