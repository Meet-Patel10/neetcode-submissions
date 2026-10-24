class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int num : nums) {
        //     if(set.contains(num)) {
        //         return true;
        //     }
        //     set.add(num);
        // }
        // return false;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        if(set.size() != nums.length) return true;
        else return false;
    }
}