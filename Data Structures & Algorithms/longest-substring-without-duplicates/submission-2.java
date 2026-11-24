class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        Set<Character> mp = new HashSet<>();
        int maxLength = 0;
        for(int end = 0; end < s.length(); ++end){
            char currChar = s.charAt(end);
            while(mp.contains(currChar)){
                mp.remove(s.charAt(start));
                ++start;
            }
            mp.add(currChar);
            maxLength = Math.max(maxLength, end-start+1);
        }

        return maxLength;
    }
}
