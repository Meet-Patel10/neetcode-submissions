class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        int m = ans.length;
        for(int i = 0; i < m / 2; i++) {
            ans[i] = nums[i];
        }
        int k = 0;
        for(int i = m / 2; i < m; i++) {
            ans[i] = nums[k];
            k++;
        }
        return ans;
    }
}