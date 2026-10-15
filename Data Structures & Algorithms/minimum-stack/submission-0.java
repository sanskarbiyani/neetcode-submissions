class MinStack {
    private Stack<Integer> minStack;
    private Stack<Integer> st;

    public MinStack() {
        minStack = new Stack<>();
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);

        if(minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty()){
            if(minStack.peek().equals(st.peek()))
                minStack.pop();
            st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
