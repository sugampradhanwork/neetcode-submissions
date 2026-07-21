class Solution {
    public int maxArea(int[] heights) {
        int max = 0;

        for(int i = 0; i < heights.length - 1; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                int min = Math.min(heights[i], heights[j]);
                int distance = j - i;
                int total = min * distance;
                max = Math.max(max, total);
            }
        }
        return max;
    }
}
