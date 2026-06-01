class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        int ans = 0;
        int take = 0;
        if(n == 1) return cost[0];
        if(n == 2) return cost[0] + cost[1];
            
        Arrays.sort(cost);
        for(int i = n - 1; i >= 0;){
            if(take < 2){
                ans += cost[i];
                i--;
                take++;
            }
            else{
                i--;
                take = 0;
            }
        }
        return ans;
    }
}