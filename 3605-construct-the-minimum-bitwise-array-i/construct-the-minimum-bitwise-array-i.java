class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        Arrays.fill(ans, -1);
        int idx = 0;
        for(int num: nums){
            for(int i = 1; i < num; i++){
                if(((i) | (i + 1)) == num){
                    ans[idx] = i;
                    break;
                }
            }
            idx++;
        }
        return ans;
    }
}