class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            int r = i;
            int flip = k;
            int count = 0;
            while(flip >= 0 && r < nums.length) {
                if(nums[r] == 1) {
                    count++;
                } else {
                    if(flip > 0) {
                        count++;
                    }
                    flip--;
                }
                r++;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}