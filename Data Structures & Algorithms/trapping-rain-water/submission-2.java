class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int rMax = height[n-1];
        int lMax = height[0];

        int l = 1;
        int r = n-2;

        int res = 0;
        while(l <= r){
            if(rMax <= lMax){
                // Add 0 to the result when current element is greater than rMax
                res += Math.max(0, rMax - height[r]);
                rMax = Math.max(rMax, height[r]);
                --r;
            } else {
                // Add 0 to the result when current element is greater than lMax
                res += Math.max(0, lMax - height[l]);
                lMax = Math.max(lMax, height[l]);
                ++l;
            }
        }

        return res;
    }
}
