class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            int n = str.length();
            sb.append(n).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        for (int i = 0; i < str.length();) {
            int length = 0;
            while (str.charAt(i) != '#') {
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }

            // Skip '#'
            i++;

            // Extract the string using the known length
            decoded.add(str.substring(i, i + length));

            // Move to the beginning of the next encoded string
            i += length;
        }

        return decoded;
    }
}
