class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int[] start = points[0];
        int time = 0;
        int i = 1;
        while(i < points.length){
            int[] end = points[i];
            // X Cordinate is same -- Move vertically
            if(start[0] == end[0]){
                time += (Math.abs(start[1] - end[1]));
                start = end;
                i++;
            }
            // Y Cordinate is same -- Move horizontally
            else if(start[1] == end[1]){
                time += (Math.abs(start[0] - end[0]));
                start = end;
                i++;
            }
            // Move Diagonally
            else{
                if(end[0] > start[0]) start[0]++;
                if(end[0] < start[0]) start[0]--;
                if(end[1] > start[1]) start[1]++;
                if(end[1] < start[1]) start[1]--;
                time++;
            }
        }
        return time;
    }
}