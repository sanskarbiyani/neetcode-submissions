class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for(int i=0; i<nums.length; ++i){
            boolean inserted = values.add(nums[i]);
            if(!inserted)
                return true;
        }
        return false;
    }
}