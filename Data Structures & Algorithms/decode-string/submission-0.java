class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==']'){
                StringBuilder sb=new StringBuilder();
                while(!Character.isDigit(st.peek())){
                    char c=st.pop();
                    if(c=='[') continue;
                    sb.append(c);
                }
                String h=sb.reverse().toString();
                StringBuilder num=new StringBuilder();
                 while(!st.isEmpty() && Character.isDigit(st.peek())){
                    char c=st.pop();
                    num.append(c);
                }
                String y=num.reverse().toString();
                int n=Integer.parseInt(y);
                h=h.repeat(n);
                for(int j=0;j<h.length();j++){
                    st.push(h.charAt(j));
                }
            }else{
                st.push(ch);
            }
        }
        StringBuilder gt=new StringBuilder();
        while(!st.isEmpty()){
             char c=st.pop();
             gt.append(c);
        }
        gt.reverse();
        return gt.toString();
    }
}