class Solution {
    public void moveZeroes(int[] nums) {
        int first = 0;
        int second = 1;
        while(second < nums.length) {
            if(
                (nums[first] !=0 && nums[second] == 0) || 
                (nums[first] !=0 && nums[second] != 0)
                ) {
                first++;
                second++;
            } else if(nums[first] == 0 && nums[second] != 0) {
                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
                first++;
                second++;
            } else if(nums[first] ==0 && nums[second] == 0){
                second++;
            }
        }
    }
}