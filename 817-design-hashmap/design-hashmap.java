class MyHashMap {
    int v[];

    public MyHashMap() {
        v=new int[1000001];
        Arrays.fill(v,-1);
    }
    
    public void put(int key, int value) {
        v[key]=value;
    }
    
    public int get(int key) {
        //if(v[key]==0) return -1;
        return v[key];
    }
    
    public void remove(int key) {
        v[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */