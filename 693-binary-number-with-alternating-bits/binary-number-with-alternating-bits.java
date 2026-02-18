class Solution {
    public boolean hasAlternatingBits(int n) {
        // boolean ans = false;
        int lastBit = Integer.MAX_VALUE;
        while(n > 0){
            int temp = n % 2;
            if(lastBit == temp){
                return false;
            }
            lastBit = temp;
            n /= 2;
        }
        return true;
    }
}