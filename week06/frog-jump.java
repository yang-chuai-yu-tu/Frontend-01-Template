class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for(int i = 0; i < stones.length; i++){
            map.put(stones[i], new HashSet<Integer>());
        }
        map.get(stones[0]).add(0);
        for(int i = 0; i < stones.length; i++){
            //这回的dp不用数组，而且在i - 1步已经设置好了i步的数据所以取i
            for(int step : map.get(stones[i])){
                for(int j = step - 1; j <= step + 1; j++){
                    //不能往回跳
                    if(j > 0 && map.containsKey(stones[i] + j)) map.get(stones[i] + j).add(j);
                }
            }
        }
        return map.get(stones[stones.length - 1]).size() > 0;
    }
}