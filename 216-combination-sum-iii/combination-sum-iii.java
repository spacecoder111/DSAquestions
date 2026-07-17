class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        solve(ans,list,k,n,1);
        return ans;
    }
    public void solve(List<List<Integer>> ans ,List<Integer> list,int k,int target,int idx){
        if(target<0) return;
        if(target==0){
            if(list.size()!=k) return;
            ans.add(new ArrayList(list));
            return;
        }
       // if(k<=0) return;
        for(int i=idx;i<=9;i++){
           // if(i>idx && c[i]==c[i-1]) continue;
            list.add(i);
            solve(ans,list,k,target-i,i+1);
            list.remove(list.size()-1);
        }
    }
}