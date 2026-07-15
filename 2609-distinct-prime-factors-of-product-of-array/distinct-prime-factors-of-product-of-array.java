class Solution {
    public int distinctPrimeFactors(int[] nums) {
        //int n=nums.length
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            while(num%2==0){
                set.add(2);
                num/=2;
            }
            for(int i=3;i*i<=num;i+=2){
                while(num%i==0){
                    set.add(i);
                    num/=i;
                }
                if(num==1) break;
            }
            if(num>1) set.add(num);
        }
        return set.size();
    }
}