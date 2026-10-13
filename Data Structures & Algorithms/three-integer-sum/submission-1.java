class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> retVal = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<n-2; ++i){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j=i+1, k = n-1;
            int target = -nums[i];

            while(j<k){
                int sum = nums[j] + nums[k];
                if(sum == target){
                    List<Integer> temp = List.of(nums[i], nums[j], nums[k]);
                    retVal.add(temp);
                    ++j;
                    --k;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                    // break;
                } else if (sum < target){
                    j++;
                } else {
                    k--;
                }
            }
        }

        return retVal;
    }
}
