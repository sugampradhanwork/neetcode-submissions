class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String s: strs) {
            res += s.length() + "#" + s;
        }
        return res;
    }

    public List<String> decode(String str) {
        // 4#code10#abcdefghij
        int i = 0;
        int j = 0;
        List<String> res = new ArrayList<>();
        while(i < str.length()) {
            j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int count = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j+1, j + count +1));
            i = j + count + 1;
        }
        return res;
    }
}
