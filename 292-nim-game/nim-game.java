class Solution {
    public boolean canWinNim(int n) {
        // boolean b=true;
        // while(n%4==0){
        //     n-=3;
        //     b=!b;
        // }
        return n%4!=0;
    }
}