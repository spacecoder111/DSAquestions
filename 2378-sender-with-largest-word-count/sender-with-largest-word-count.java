class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map=new HashMap<>();
        int prev=0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<senders.length;i++){
            String text=senders[i];
            String[] words=messages[i].trim().split("\\s+");
             int c=words.length;
             map.put(text,map.getOrDefault(text,0)+c);
             if(map.get(text)>=prev){
                if(map.get(text) == prev){
                boolean x=ans.toString().compareTo(text)>0;
                //ans.setLength(0);
                if(x){
                    continue;
                } //ans.append(ans);
                else{
                    ans.setLength(0);
                    ans.append(text);
                } 
               // prev=map.get(text);
                }else{
                    
                     ans.setLength(0);
                     ans.append(text);
                }
                 prev=map.get(text);
             }
        }
        return ans.toString();
    }
}