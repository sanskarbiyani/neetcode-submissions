class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        // System.out.println(s1);
        int i = 0; // Forwared Pointer
        int j = s1.length()-1; // Backward Pointer

        while (j>i){
            // System.out.println("Comparing " + s1.charAt(i) + " " + s1.charAt(j));
            if (s1.charAt(i) != s1.charAt(j)){
                return false;
            }

            ++i;
            --j;
        }

        return true;
    }
}
