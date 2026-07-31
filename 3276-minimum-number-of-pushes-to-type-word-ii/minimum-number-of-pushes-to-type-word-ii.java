class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        int arr[]=new int[26];
        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        } 
        int c=0;
        int ans=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            int idx=-1;
            int max=-1;
            for(int j=0;j<26;j++){
                if(arr[j]==0) continue;
               if(arr[j]>max){
                max=arr[j];
                idx=j;
               }
            }
            if(idx==-1) break;
            arr[idx]=0;
            if(c<=7){
                ans+=max;
            }else if(c<=15){
                 ans+=max*2;
            }else if(c<=23){
                 ans+=max*3;
            }else{
                 ans+=max*4;
            }
            c++;
        }
        return ans;
    }
}



        // sb.append((char)('a'+idx));
        // for(char ch:sb.toString().toCharArray()){
        //     if(set.contains(ch)) continue;
        //     if(c<=7){
        //         map.put(ch,1);
        //     }else if(c<=15){
        //         map.put(ch,2);
        //     }else if(c<=23){
        //         map.put(ch,3);
        //     }else{
        //         map.put(ch,4);
        //     }
        //     c++;
        //     set.add(ch);
        // }
        
        // for(char ch:word.toCharArray()){
        //     ans+=map.get(ch);
        // }