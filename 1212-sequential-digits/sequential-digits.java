class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int i=1;
        List<Integer> ans=new ArrayList<Integer>();
        while(i<9){
            long j=i;
            int x=i+1;
            while(j<=high && x<=9 && j%10!=0){
                j=j*10+x;
                if(j>=low && j<=high) ans.add((int)j);
                x++;
            }
            i++;
        }
        Collections.sort(ans);
        return ans;
    }
}