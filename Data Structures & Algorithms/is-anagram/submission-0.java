class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charArr = new int[26];
        int lenS = s.length();
        int lenT = t.length();
        if(lenS != lenT) return false;
        for(int i = 0; i < lenS; i++) {
            char charValue = s.charAt(i);
            charArr[charValue - 'a']++;
        }
        for(int i = 0; i < lenT; i++) {
            char charValue = t.charAt(i);
            charArr[charValue - 'a']--;
        }
        for(int num : charArr) {
            if(num > 0) {
                return false;
            }
        }
        return true;
    }
}
