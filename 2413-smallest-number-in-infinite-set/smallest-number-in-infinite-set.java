class SmallestInfiniteSet {
    int arr[];
    public SmallestInfiniteSet() {
        arr=new int[1001];
        for(int i=0;i<1001;i++) arr[i]=1; 
    }
    
    public int popSmallest() {
        int i=1;
        while(i<1001){
            if(arr[i]==1){
                arr[i]=-1;
                return i;
            }
            i++;
        }
        return -1;
    }
    
    public void addBack(int num) {
        arr[num]=1;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */