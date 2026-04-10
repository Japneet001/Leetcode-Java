class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        if(n < 3) return -1;

        for(int i = 0; i < n; i++){
            int temp1 = nums[i];
            for(int j = i + 1; j < n; j++){
                int temp2 = nums[j];
                if((i != j) && (temp1 == temp2)){
                    for(int k = j + 1; k < n; k++){
                        int temp3 = nums[k];
                        if((i != k) && (j != k) && (temp1 == temp3)){
                            ans = Math.min(ans, Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i));
                        }
                    }
                }
                
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}