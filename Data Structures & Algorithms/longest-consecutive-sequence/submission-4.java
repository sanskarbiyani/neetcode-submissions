class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        SortedSet<Integer> st = new TreeSet<>();
        for(int num: nums){
            st.add(num);
        }

        // System.out.print("TreeSet: ");
        for(int num: st){
            System.out.print(num + " ");
        }
        System.out.println();

        Integer longest = 1;
        Integer maxLongest = 1;
        Integer prev = null;
        for(int num: st){
            // System.out.println("Comparing: " + prev + " " +  num);
            if(prev == null){
                prev = num;
                continue;
            } else if ((num - prev) == 1){
                ++longest;
            } else {
                maxLongest = Math.max(maxLongest, longest);
                longest = 1;
            }
            prev = num;
        }
        maxLongest = Math.max(maxLongest, longest);
        return maxLongest;
    }
}
