class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numsSet = new HashSet<>();
        for(int num: nums) {
            numsSet.add(num);
        }
        int largest = 0;
        // int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!numsSet.contains(nums[i] - 1)) {
                int max = 0;
                while(numsSet.contains(nums[i] + max)) {
                    max++;
                    largest = Math.max(largest, max);
                }
            } 
        }
        return largest;

        
        /*if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                
            }
            else if((nums[i] - 1) == nums[i-1]) {
                count++;
                if(count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        return max;
        */
    }
}
