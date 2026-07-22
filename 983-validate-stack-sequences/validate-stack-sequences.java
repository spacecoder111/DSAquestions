class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        Stack<Integer> st=new Stack<>();
        int j=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
            st.push(pushed[i]);
        }
        while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        return st.isEmpty();
    }
}