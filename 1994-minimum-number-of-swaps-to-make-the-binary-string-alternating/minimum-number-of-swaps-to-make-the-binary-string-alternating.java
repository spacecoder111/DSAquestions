class Solution {
    public int minSwaps(String s) {
        String p="01";
        String q="10";
        int c1=0,c2=0;
        int z=0,o=0;
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='0') z++;
        else o++;
        if(p.charAt(i%2)!=ch) c2++;
        if(q.charAt(i%2)!=ch) c1++;
        }
        if(Math.abs(z-o)>1) return -1;
        return o==z?Math.min(c1,c2)/2:o>z?c1/2:c2/2;
    }
}

 //    // if(ch=='0') {
        //         if(i%2==1 && ch!='0') {
        //         c1++;
        //         o++;
        //         }else{
        //         if(i%2==0 && ch!='1') {
        //         c2++;
        //         z++;
        //         }
        //     }
