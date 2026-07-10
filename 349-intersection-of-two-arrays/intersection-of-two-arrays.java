class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums1) set.add(num);
        List<Integer> list=new ArrayList<>();
        Set<Integer> set2=new HashSet<>();
        for(int num:nums2){
            if(set.contains(num) && !set2.contains(num)){
                list.add(num);
            }
            set2.add(num);
        }
        int n=list.size();
        int res[]=new int[n];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
}