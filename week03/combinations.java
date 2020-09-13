class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(k <= 0 || n < k){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(n, k, 1, path, res);
        return res;
    }

    private void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res){
        //长度为k为一个答案，终止
        if(path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        //遍历所有起点
        for(int i = begin; i <= n; i++){
            path.addLast(i);
            //下个点的起始位置加一
            dfs(n, k, i + 1, path, res);
            //因为大家共用一个path所以结束的时候回退
            path.removeLast();
        }
    }
}