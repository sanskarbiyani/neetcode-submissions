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
        System.out.println("Encoded String: " + str);
        List<String> retVal = new ArrayList<>();
        for(int i = 0; i<str.length();){
            int wordSize = 0;
            while (str.charAt(i) != '#'){
                int num = str.charAt(i) - '0';
                wordSize = wordSize*10 + num;
                ++i;
            }
            StringBuilder sb = new StringBuilder();
            int j = i+1;
            for (; j <= wordSize + i; ++j){
                sb.append(str.charAt(j));
            }
            i = j;
            retVal.add(sb.toString());
        }
        return retVal;
    }
}
