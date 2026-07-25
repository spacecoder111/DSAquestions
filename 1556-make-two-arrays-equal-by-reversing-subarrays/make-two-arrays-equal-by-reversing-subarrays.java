class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<target.length;i++){
            map1.put(target[i],map1.getOrDefault(target[i],0)+1);
            map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
        }
        return map1.equals(map2);
    }
}