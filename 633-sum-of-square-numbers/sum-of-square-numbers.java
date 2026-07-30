class Solution {
    public boolean judgeSquareSum(int c) {
        //i
        int t=0;
        for(int i=0;i<=Math.sqrt(c);i++){//Math.sqrt(c))
            int x=i*i;
            boolean y=bs(c-x,(int)Math.sqrt(c));
            if(y) return true;
        }
        return false;
   }
   boolean bs(int x,int n){
    int l=0,h=n;
    while(l<=h){
        int mid=l+(h-l)/2;
        if(mid*mid==x) return true;
        else if(mid*mid>x) h=mid-1;
        else l=mid+1;
    }
    return false;
   }
}