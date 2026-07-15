class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n;
        int even=n*(n+1);
        return gcd(odd,even);
    }
    int gcd(int x,int y){
        if(x==0) return y;
        return gcd(y%x,x);
    }
}