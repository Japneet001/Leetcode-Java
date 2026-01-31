class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        char ans = letters[0];
        while(start <= end){
            int mid = start + (end - start) / 2;
            char ch = letters[mid];
            if(ch > target){
                ans = ch;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}