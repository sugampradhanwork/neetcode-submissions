class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> reminder = new HashMap<>();
        reminder.put(0, -1);

        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
            int rem = total % k;

            if(!reminder.containsKey(rem)) {
                reminder.put(rem, i);
            } else if(i -  reminder.get(rem) > 1) {
                return true;
            }
        }
        return false;
    }
}