class Solution {
    public int maxProduct(int n) {
        int x=(int)Math.log(n)+1;
        int arr[]=new int[x];
        int k=0;
        while(n>0){
            arr[k++]=n%10;
            n/=10;
        }
        int max=0;
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                max=Math.max(max,arr[i]*arr[j]);
            }
        }
        return max;
    }
}