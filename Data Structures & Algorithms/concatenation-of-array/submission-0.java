class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int newLength = 2 * n;
        int[] retVal = new int[newLength];
        for(int i = 0; i<n; ++i){
            retVal[i] = nums[i];
            retVal[i+n] = nums[i];
        }

        return retVal;
    }
}