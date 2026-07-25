class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        int total = 1;
        int l = 0;
        int r = 0;
        for(r = 0; r < nums.length; r++) {

            total *= nums[r];
            while( l <=r && total >= k) {
                total = total / nums[l];
                l++;
            } 
            res += r - l + 1;
        }
        return res;
    }
}