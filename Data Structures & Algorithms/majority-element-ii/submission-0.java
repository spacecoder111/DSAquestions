class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }  
        int f=nums.length/3;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){ 
            if(e.getValue()>f) list.add(e.getKey());
        }
        return list;
    }
}