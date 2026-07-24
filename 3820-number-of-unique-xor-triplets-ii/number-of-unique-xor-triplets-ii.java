class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                //for(int k=j;k<n;k++){
                    int x=(nums[i]^nums[j]);//^nums[k];
                    set1.add(x);
                //}
            }
        }
        for(int y:set1){
             for(int k=0;k<n;k++){
                    int x=(y^nums[k]);//^nums[k];
                    set.add(x);
                }
        }
        return set.size();
    }
}