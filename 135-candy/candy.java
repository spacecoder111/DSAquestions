class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int i=1;
        int ans=n;
        while(i<n){
            if(ratings[i-1]==ratings[i]){
                //ans+=1;
                i++;
                continue;
            }
            int c=0;
            while(i<n && ratings[i-1]<ratings[i]){
                c++;
                ans+=c;
                i++;
            }
            int d=0;
            while(i<n && ratings[i-1]>ratings[i]){
                d++;
                ans+=d;
                i++;
            }
            //if(c<d){
                ans-=Math.min(d,c);
           // }
        }
        return ans;
    }
}

// int left[]=new int[n];
//         int right[]=new int[n];
//         left[0]=1;
//         for(int i=1;i<n;i++){
//             if(ratings[i-1]<ratings[i]) left[i]=left[i-1]+1;
//             else left[i]=1;
//         }
//         right[n-1]=1;
//         for(int i=n-2;i>=0;i--){
//             if(ratings[i+1]<ratings[i]) right[i]=right[i+1]+1;
//             else right[i]=1;
//         }
//         int ans=0;
//         for(int i=0;i<n;i++){
//             ans+=Math.max(left[i],right[i]);
//         }
//         return ans;