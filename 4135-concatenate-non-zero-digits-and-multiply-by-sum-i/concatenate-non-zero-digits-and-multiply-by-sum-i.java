class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0L;
        int sum = 0;
        int i = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            if(digit != 0){
                ans += digit * Math.pow(10, i);
                i++;
            }
            n = n / 10;
        }

        return ans * sum;
    }
}