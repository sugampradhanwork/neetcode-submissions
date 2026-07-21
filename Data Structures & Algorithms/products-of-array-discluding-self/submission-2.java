class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] prefix = new int[size];
        int[] postfix = new int[size];
        int[] result = new int[size];

        for(int i = 0; i < size; i++) {
            if(i == 0) {
                prefix[i] = nums[i];
            } else {
                prefix[i] = prefix[i - 1] * nums[i];
            }
        }
        postfix[size -1] = nums[size -1];
        for(int i = size - 2; i >=0; i--) {
           postfix[i] = postfix[i+1] * nums[i];
        }

        for(int i = 0; i < size; i++) {
            if(i == 0) {
                result[i] = postfix[i+1];
            } else if(i == size -1) {
                result[i] = prefix[i-1];
            } else {
                result[i] = prefix[i-1] * postfix[i+1];
            }
        }
        
        return result;
    }
}  
