class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; ++i){
            int diff = target - nums[i];
            // System.out.println("Difference: " + diff + ". Present: " + set.contains(diff));
            if(mp.containsKey(diff)){
                int ind = mp.get(diff);
                if(ind < i)
                    return new int[]{ind, i};
                else
                    return new int[] {i, ind};
            } else {
                mp.put(nums[i], i);
            }
        }

        return new int[] {-1, -1};
    }
}
