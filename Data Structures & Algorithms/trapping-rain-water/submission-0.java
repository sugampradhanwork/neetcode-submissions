class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int[] maxLeft = new int[l];
        int[] maxRight = new int[l];
        maxLeft[0] = height[0];
        maxRight[l - 1] = height[l-1];
        for(int i = 1; i < l; i++) {
            int max = Math.max(maxLeft[i-1], height[i]);
            maxLeft[i] = max;
        }
        

        for(int i = l - 2; i >= 0; i--) {
            int max = Math.max(maxRight[i+1], height[i]);
            maxRight[i] = max;
        }


        int trappedWater = 0;
        for(int i = 0; i < l; i++) {
            int min = Math.min(maxLeft[i], maxRight[i]);
            int total = min - height[i];
            if(total >= 0) {
                trappedWater += total;
            }
        }
        return trappedWater;
    }
}
