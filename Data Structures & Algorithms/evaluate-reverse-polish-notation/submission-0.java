class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            //int a=String.valueOf(s);
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int a=st.pop();
                int b=st.pop();
                if(s.equals("+")) st.push(a+b);
                if(s.equals("-")) st.push(b-a);
                if(s.equals("/")) st.push(b/a);
                if(s.equals("*")) st.push(a*b);
            }else{
              st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
