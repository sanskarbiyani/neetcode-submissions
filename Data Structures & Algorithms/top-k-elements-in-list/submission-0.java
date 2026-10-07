class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Getting the frequency count
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num: nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Creating Buckets
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key: mp.keySet()){
            int freq = mp.get(key);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // Getting the k elements
        int[] retVal = new int[k];
        int j = 0;
        for(int i=buckets.length-1; i>=0 && j<k; i--){
            if(buckets[i] != null){
                for(int elem: buckets[i]){
                    retVal[j++] = elem;
                }
            }
        }

        return retVal;
    }
}
