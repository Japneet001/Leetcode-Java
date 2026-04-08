class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD = 1_000_000_007;
        int qLen = queries.length;
        int ans = 0;

        for(int i = 0; i < qLen; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];
            int idx = l;
            while(idx <= r){
                long temp = nums[idx];
                nums[idx] = (int)((temp * v) % MOD);
                idx += k;
            }
        }

        for(int num: nums){
            ans ^= num;
        }

        return ans;
    }
}