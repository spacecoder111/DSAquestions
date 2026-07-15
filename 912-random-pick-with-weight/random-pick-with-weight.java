class Solution {
    int prefix[];
    int n;
    Random rand=new Random();
    public Solution(int[] w) {
        this.n=w.length;
        this.prefix=new int[n];
        prefix[0]=w[0];
        for(int i=1;i<n;i++){
        prefix[i]=w[i]+prefix[i-1];
        }
    }
    
    public int pickIndex() {
        int x=rand.nextInt(1,prefix[n-1]+1);
        return bs(x);
    }
    int bs(int x){
        int i=0,j=n-1;
        int ans=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(prefix[mid]==x) return mid;
            if(prefix[mid]>x){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */