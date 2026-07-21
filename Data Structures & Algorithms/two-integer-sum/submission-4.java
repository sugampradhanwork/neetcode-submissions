class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(!numsMap.containsKey(diff)) {
                numsMap.put(nums[i], i);
            } else {
                return new int[]{numsMap.get(diff), i};
            }
        }
        return new int[]{-1, -1};

        // This is brute force
        /*
        for(int i = 0; i < nums.length - 1; i ++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};                }
            }
        }
        return new int[]{-1, -1};
        */
    }
}
