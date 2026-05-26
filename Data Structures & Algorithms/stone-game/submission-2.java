class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int dp[]=new int[n];
        dp[0]=piles[0];
        dp[1]=Math.max(piles[1],piles[0]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],piles[i]+dp[i-2]);
            System.out.println(dp[i]);
        }
        return true;
    }
}



// int i=0,j=piles.length-1;
//         int a=0,b=0;
//         boolean vis=true;
//         while(i<=j){
//             if(piles[i]==piles[j]){
//                 i++;
//                 j--;
//                 continue;
//             }
//             if(piles[i]<piles[j]){
//                 if(vis){
//                     a+=piles[j];
//                     j--;
//                 }else{
//                     b+=piles[j];
//                     j--;
//                 }
//             }else{
//                  if(vis){
//                     a+=piles[i];
//                     i++;
//                 }else{
//                     b+=piles[i];
//                     i++;
//                 }
//             }
//             System.out.println(a+" "+b);
//             vis=!vis;