class StockSpanner {

    Stack<int[]> st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        //Stack<Integer> x=new Stack<>();
        int c=1;
        while(!st.isEmpty() && st.peek()[0]<=price){
            // x.push(st.pop());
            // c++;
            c+=st.pop()[1];
        }
        // while(!x.isEmpty()){
        //     st.push(x.pop());
        // }
        st.push(new int[]{price,c});
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */