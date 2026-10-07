class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> retVal = new ArrayList<>();
        HashMap<String, List<String>> mp = new HashMap<>();
        
        for(String str: strs){
            int[] count = new int[26];
            // Storing the count of each character
            for(char ch: str.toCharArray()){
                count[ch - 'a']++;
            }

            // Getting the associated string
            StringBuilder st = new StringBuilder();
            for(int cnt: count){
                st.append(cnt).append('#');
            }
            String key = st.toString();

            // Checking for existing strings
            if(!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(str);
        }

        return new ArrayList<>(mp.values());
    }
}
