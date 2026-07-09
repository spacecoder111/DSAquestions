class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        Map<Integer,Integer> map=new HashMap<>();
        int l=n-1;
        map.put(l,l);
        for(int i=n-2;i>=0;i--){
            if(nums[i+1]-nums[i]<=maxDiff){
                map.put(i,l);
            }else{
                map.put(i,i);
                l=i;
            }
        }
       // Arrays.sort(queries,(a,b)->a)
        boolean res[]=new boolean[queries.length];
        int j=0;
        for(int q[]:queries){
            int x=q[0],y=q[1];
            if(x>y){
                int temp=x;
                x=y;
                y=temp;
            }
            int p=map.get(x);
            if(p>=y || x==y) {
                res[j++]=true;
            }else{
                res[j++]=false;
            }
        }
        return res;
    }
}