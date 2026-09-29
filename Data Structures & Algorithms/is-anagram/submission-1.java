class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();

        for(char ch: s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for(char ch: t.toCharArray()){
            mp2.put(ch, mp2.getOrDefault(ch, 0) + 1);
        }

        return mp.equals(mp2);
    }
}
