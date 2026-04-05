class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int posX = 0;
        int posY = 0;
        for(int i = 0; i < n; i++){
            char ch = moves.charAt(i);
            if(ch == 'U') posY++;
            else if(ch == 'D') posY--;
            else if(ch == 'L') posX++;
            else posX--;
        }

        return (posX == 0) & (posY == 0);
    }
}