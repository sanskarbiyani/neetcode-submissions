class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        // If only 1 elem present, then result will be {0}
        if(n == 1){
            res[0] = 0;
            return res;
        }

        // Getting the maximium values for each index
        Deque<Integer> st = new ArrayDeque<>();
        st.push(0);
        for(int i=1; i<n; ++i){
            int currElem = temperatures[i];
            int topInd = st.peek();
            int topElem = temperatures[topInd];

            // if(topElem >= currElem){
            //     st.push(currElem);
            // } else {
                // int ind = 1;
                while(!st.isEmpty() && topElem < currElem){
                    st.pop();
                    res[topInd] = i-topInd;
                    if(st.isEmpty())
                        break;
                    
                    topInd = st.peek();
                    topElem = temperatures[topInd];
                }
                st.push(i);
            // }
        }
        return res;
    }
}
