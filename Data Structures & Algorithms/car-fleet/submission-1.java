class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        // Sorting the position and speed array using indices array
        Integer[] indices = new Integer[n];
        for(int i=0; i<n; ++i){
            indices[i] = i;
        }

        Arrays.sort(indices, Comparator.comparingInt(i -> position[i]));
        int[] sortedPos = new int[n];
        int[] sortedSpeed = new int[n];
        for(int i=0; i<n; ++i){
            sortedPos[i] = position[indices[i]];
            sortedSpeed[i] = speed[indices[i]];
        }

        double[] time = new double[n];
        for(int i=0; i<n; ++i){
            time[i] = (double)(target - sortedPos[i]) / sortedSpeed[i];
        }
        // System.out.print("Time: ");
        // for(int i=0; i<n; ++i){
        //     System.out.print(time[i] + " ");
        // }

        Deque<Double> st = new ArrayDeque<Double>();
        st.push(time[n-1]);
        for(int i=n-2; i>=0; --i){
            if(time[i] > st.peek()){
                st.push(time[i]);
            }
        }
        return st.size();
    }
}
