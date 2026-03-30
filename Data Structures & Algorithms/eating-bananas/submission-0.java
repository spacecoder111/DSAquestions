class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,hi=0;
        for(int p:piles){
            //l=Math.min(l,p);
            hi=Math.max(hi,p);
        }
        while(l<hi){
            int m=(l+hi)/2;
            if(check(piles,m,h)){
                hi=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    boolean check(int p[],int m,int h){
        int c=0;
        for(int b:p){          
      if(m!=0 && b<=m ){
                c+=1;
            }else if(m!=0 && b%m!=0){
                c+=(b/m)+1;
            }else if(m!=0){
                c+=b/m;
            }
        }
        return c<=h;
    }
}

//  if(m!=0 && b<=m ){
//                 c+=1;
//             }else if(m!=0 && b%m!=0){
//                 c+=(b/m)+1;
//             }else if(m!=0){
//                 c+=b/m;
//             }
