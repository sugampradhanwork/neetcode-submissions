class Solution {
    public int longestOnes(int[] nums, int k) {


        int l = 0;
        int r = 0;
        int zeros = 0;
        int res = 0;

        while(r < nums.length) {
            if(nums[r] == 0) {
                zeros++;
            } 
            if(zeros > k) {
                if( nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;


        // int max = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     int r = i;
        //     int flip = k;
        //     int count = 0;
        //     while(flip >= 0 && r < nums.length) {
        //         if(nums[r] == 1) {
        //             count++;
        //         } else {
        //             if(flip > 0) {
        //                 count++;
        //             }
        //             flip--;
        //         }
        //         r++;
        //     }
        //     max = Math.max(count, max);
        // }
        // return max;
    }
}