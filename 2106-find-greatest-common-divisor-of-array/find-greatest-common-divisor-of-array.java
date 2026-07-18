class Solution {
    private int calGCD(int a, int b){
        if(b == 0) return a;
        return calGCD(b, a % b);
    }

    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];
        for(int i = 1; i < nums.length; i++){
            largest = (nums[i] > largest) ? nums[i] : largest;
            smallest = (nums[i] < smallest) ? nums[i] : smallest;
        }
        return calGCD(smallest, largest);
    }
}