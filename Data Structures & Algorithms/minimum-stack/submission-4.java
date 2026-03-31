class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    
    public MinStack() {
          st=new Stack<>();
          minst=new Stack<>();
    }
    
    public void push(int val) {
           st.push(val);
           if(minst.isEmpty() || minst.peek()>=st.peek()){
            minst.push(val);
           }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        int a=st.pop();
        if(!minst.isEmpty() && a==minst.peek()) minst.pop();
    }
    
    public int top() {
         //if(st.isEmpty()) return -1;
        return st.peek();
    }
    
    public int getMin() {
        //if(st.isEmpty() || minst.isEmpty()) return -1;
        return minst.peek();
    }
}
