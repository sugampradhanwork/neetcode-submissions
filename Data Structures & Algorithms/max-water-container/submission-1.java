class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;
        while(left < right) {
            int total = (right - left) * Math.min(heights[left], heights[right]);
            maxArea = Math.max(total, maxArea);

            if(heights[left] <= heights[right]) {
                left++;
            } else if(heights[left] > heights[right]) {
                right--;
            }
        }

        return maxArea;



        // Brute force...
        /*
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
        */
    }
}
