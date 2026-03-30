class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int i=0;
        int n=strs.length;
        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String p=new String(ch);
            if(map.containsKey(p)){
                int r=map.get(p);
                list.get(r).add(s);
            }else{
                list.add(new ArrayList<>());
                map.put(p,i);
                list.get(i).add(s);
                i++;
            }
        }
        return list;
    }
}
