class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs(((30 * hour) - (5.5 * minutes)) % 360);   
        if(angle > 180.0){
            angle = 360 - angle;
        }
        return angle;
    }
}