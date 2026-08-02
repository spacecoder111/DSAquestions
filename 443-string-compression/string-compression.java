class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0,k=0;
        int ans=0;
        while(i<n){
            int c=0,j=i;
            while(j<n && chars[i]==chars[j]){
                c++;
                j++;
            }
            // int x=1+(int)(Math.log(c)/Math.log(10));
            int x=String.valueOf(Math.abs(c)).length();
            if(c==1){
                ans+=1;
                chars[k++]=chars[i];
            }else{
                ans+=1+x;
                chars[k++]=chars[i];
                String y=String.valueOf(c);
                for(int h=0;h<y.length();h++){
                    chars[k++]=y.charAt(h);
                }
            }
            i=j;
        }
       // for(int p=ans-1;p<n;p++) chars[p]='.';
        System.out.println(ans);
        return ans;
    }
}