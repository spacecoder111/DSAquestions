class Solution {
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<List<String>> list=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     List<String> l=new ArrayList<>();
        //     for(int j=i+1;j<=n;j++){
        //        if(isPalindrome(s.substring(i,j))) l.add(s.substring(i,j));
        //     }
        //     list.add(l);
        // }
        // return list;
        solve(s,list,new ArrayList<>(),0,n);
        return list;
    }
    void solve(String s,List<List<String>> list,List<String> cur,int idx,int n){
        if(idx>=n){
            list.add(new ArrayList<>(cur));
            return;
        }
        for(int i=idx;i<n;i++){
            if(isPalindrome(s.substring(idx,i+1))){
                cur.add(s.substring(idx,i+1));
                solve(s,list,cur,i+1,n);
                cur.remove(cur.size()-1);
            }
        }
    }
    boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}