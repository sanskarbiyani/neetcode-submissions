class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = tokens.length;
        for(int i=0; i<n; ++i){
            int a, b, result;
            switch(tokens[i]){
                case "+":
                    a = st.pop();
                    b = st.pop();
                    result = b+a;
                    st.push(result);
                    break;
                case "-":
                    a = st.pop();
                    b = st.pop();
                    result = b-a;
                    st.push(result);
                    break;
                case "*":
                    a = st.pop();
                    b = st.pop();
                    result = b*a;
                    st.push(result);
                    break;
                case "/":
                    a = st.pop();
                    b = st.pop();
                    result = b/a;
                    st.push(result);
                    break;
                default:
                    st.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        return st.pop();
    }
}
