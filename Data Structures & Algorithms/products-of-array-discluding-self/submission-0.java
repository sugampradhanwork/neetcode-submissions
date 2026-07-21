class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int total = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    total *= nums[j];
                }
            }
            res[i] = total;
        }
        return res;
    }
}  
