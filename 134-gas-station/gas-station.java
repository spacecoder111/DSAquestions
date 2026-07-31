class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0,tc=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            tg+=gas[i];
            tc+=cost[i];
        }
        if(tg<tc) return -1;
        int t=0;
        int idx=0;
        for(int i=0;i<n;i++){
            t=t+gas[i]-cost[i];
            if(t<0){
                idx=i+1;
                t=0;
               // break;
            } 
        }
        return idx%n;
    }
}