class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int count_ = 0;

        for(int i = 0; i < moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'L') countL++;
            if(ch == 'R') countR++;
            if(ch == '_') count_++;
        }

        if(countL > countR) count_ = -1 * count_;

        return Math.abs(countR - countL + count_);
    }
}