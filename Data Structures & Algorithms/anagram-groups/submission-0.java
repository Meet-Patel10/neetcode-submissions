class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String elements = new String(charArray);

            if(!map.containsKey(elements)) {
                map.put(elements, new ArrayList<String>());
            }
            map.get(elements).add(str);
        }
        for(Map.Entry<String, List<String>> en : map.entrySet()) {
            ans.add(en.getValue());
        }

        return ans;
    }
}
