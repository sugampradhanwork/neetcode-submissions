class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int n: nums) {
            numsMap.put(n, numsMap.getOrDefault(n, 0) + 1);
//            if(numsMap.containsKey(n)) {
//                int c = numsMap.get(n);
//                numsMap.put(n, c + 1);
//            } else {
//                numsMap.put(n, 0);
//            }
        }
        
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: numsMap.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
            
        }
        arr.sort((a,b) -> b[0] - a[0]);
        
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;

    }
}
