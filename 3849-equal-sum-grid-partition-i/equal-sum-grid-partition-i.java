class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        long totalSum = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                totalSum += grid[i][j];
            }
        }

        System.out.println(totalSum);

        if(totalSum % 2 != 0) return false;

        long target = totalSum / 2;
        long prefixSum = 0;
        // Horizontal Cut
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                prefixSum += grid[i][j];
            }
            if(prefixSum == target) return true;
        }

        prefixSum = 0;
        // Vertical Cut
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                prefixSum += grid[i][j];
            }
            if(prefixSum == target) return true;
        }

        return false;
    }
}