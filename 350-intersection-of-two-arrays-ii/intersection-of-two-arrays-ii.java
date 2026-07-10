class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      Map<Integer,Integer> map=new HashMap<>();
      Set<Integer> set=new HashSet<>();
        for(int num:nums1) {
            map.put(num,map.getOrDefault(num,0)+1);
            set.add(num);
        }
        List<Integer> list=new ArrayList<>();
        for(int num:nums2){
            if(set.contains(num) && map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int n=list.size();
        int res[]=new int[n];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
}