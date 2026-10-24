class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < len; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar) && sMap.get(sChar) != tChar) {
                return false;
            }
            if (tMap.containsKey(tChar) && tMap.get(tChar) != sChar) {
                return false;
            }

            sMap.put(sChar, tChar);
            tMap.put(tChar, sChar);
        }
        return true;
    }
}