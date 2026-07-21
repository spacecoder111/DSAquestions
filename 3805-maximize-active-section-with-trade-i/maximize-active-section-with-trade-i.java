// class Solution {
//     public int maxActiveSectionsAfterTrade(String s) {
//         int n=s.length();
//         if(n<=2){
//             int o=0,z=0;
//             for(int i=0;i<n;i++){
//             char ch=s.charAt(i);
//             if(ch=='1') {
//                 o++;
//             }
//             }
           
//             return o;
//         }
//         int zeros=0;
//         int ones=1;
//         int ans=0;
//         int j=0;
//          int t=0;
//         while(j<n){
//             char ch=s.charAt(j);
//             if(ch=='0') break;
//             t++;
//             j++;
//         }
//         if(j==n) return t;
       
//         for(int i=j;i<n;i++){
//             char ch=s.charAt(i);
//             if(ch=='1') {
//                 ones++;
//                 t++;
//             }
//             while(ones>=3){
//                  char chx=s.charAt(j);
//                  if(chx=='1') ones--;
//                  j++;
//             }
//             ans=Math.max(ans,i-j+1);
//         }
//         if(t==0) return 0;

//         return ans+t-1;
//     }
// }










class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int count1 = 0;

        int block1 = 0;
        int block2 = 0;
        int maxx = 0;

        int i = 0;
        while(i<n){
            char ch = arr[i];

            if(ch=='0') {
                block1++;
                i++;
            }

            else{
                while(i<n && arr[i]=='1'){
                    i++;
                    count1++;
                }
                
                while(i<n && arr[i]=='0'){
                    i++;
                    block2++;
                }

                if(block1!=0 && block2!=0) maxx = Math.max(maxx, block1+block2);
                block1 = block2;
                block2 = 0;
            }

        }

        return count1 + maxx;

    }
}