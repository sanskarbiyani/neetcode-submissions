class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int n = heights.length;
        int i = 0, j = n-1;

        while(i < j){
            int min = Math.min(heights[i], heights[j]);
            int length = j - i;
            int area = min * length;
            maxArea = Math.max(maxArea, area);

            if(min == heights[i])
                ++i;
            else
                --j;
        }

        return maxArea;
    }
}
