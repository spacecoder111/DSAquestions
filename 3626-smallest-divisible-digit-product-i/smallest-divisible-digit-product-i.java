class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(mul(n)%t==0) return n;
            n++;
        }
    }
    int mul(int n){
        int ans=1;
        while(n>0){
            ans*=n%10;
            n/=10;
        }
        return ans;
    }
}