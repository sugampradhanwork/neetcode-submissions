class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // pair: [temp, index]

        for(int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]) {
                int[] pop = stack.pop();
                int diff = i - pop[1];
                res[pop[1]] = diff;
            }
            stack.push(new int[]{t, i});
        }
        return res;
    }
}
