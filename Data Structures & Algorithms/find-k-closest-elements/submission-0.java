class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
        if(a[1]!=b[1]){
            return Integer.compare(b[1],a[1]);
        }
         return Integer.compare(b[0],a[0]);
        });
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            pq.offer(new int[]{a,Math.abs(a-x)});
            if(pq.size()>k) pq.poll();
        }
        List<Integer> list=new ArrayList<>();
        int j=0;
        while(!pq.isEmpty()){
            int a[]=pq.poll();
            list.add(a[0]);
        }
         Collections.sort(list);
         return list;
    }
}