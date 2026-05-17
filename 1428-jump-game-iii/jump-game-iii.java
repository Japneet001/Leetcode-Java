class Solution {
    private boolean helper(int[] arr, int i, int n, boolean[] visited){
        if(i < 0 || i >= n || visited[i]) return false;
        if(arr[i] == 0) return true;
        visited[i] = true;
        return helper(arr, i + arr[i], n, visited) || helper(arr, i - arr[i], n, visited);
    }
    
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        return helper(arr, start, n, visited);
    }
}