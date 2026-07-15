class Solution {
    Map<Integer,Integer> map;
    int m;
    Random r=new Random();
    public Solution(int n, int[] blacklist) {
        map=new HashMap<>();
        for(int x:blacklist) map.put(x,-1);
        m=n-map.size();
        for(int x:blacklist){
            if(x<m) {
                while(map.containsKey(n-1)) n--;
                map.put(x,n-1);
                n--;
            }
        }
    }
    
    public int pick() {
        int x=r.nextInt(m);
        if(map.containsKey(x)) return map.get(x);
        return x;
    }
}



/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */