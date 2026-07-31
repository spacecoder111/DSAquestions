class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> list=new ArrayList<>();
        if(tomatoSlices%2!=0 || tomatoSlices/2<cheeseSlices) return list;
        for(int i=0;i<=Math.min(tomatoSlices,cheeseSlices);i++){
            int x=(tomatoSlices-(4*i))/2;
            int y=cheeseSlices-i;
            if(x==y){
                list.add(i);
                list.add(y);
                return list;
            }  
        }
        return list;
    }
}