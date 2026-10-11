class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 1, j = n;

        while (i < j){
            int sum = numbers[i-1] + numbers[j-1];
            // System.out.println("Comparing: " + sum);
            if(sum == target)
                return new int[] {i, j};
            else if (sum > target)
                --j;
            else 
                ++i;
        }

        return new int[]{};
    }
}
