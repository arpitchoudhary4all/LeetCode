class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points == null || points.length == 0) return 0;
        Arrays.sort(points, (a, b) ->(a[1]- b[1]));
        int preEnd = points[0][1];
        int count = 1;
        for(int i = 1; i < points.length; i++) {
            int nextStart = points[i][0];
            int nextEnd = points[i][1];
            if(nextStart > preEnd) { 
                count++;
                preEnd = nextEnd;
            }
        }
        return count;
    }
}
