class TimeMap {
    Map<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new TreeMap<>());
        }
        TreeMap<Integer,String> x=map.get(key);
        x.put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> x=map.get(key);
        if(x==null) return "";
        Integer y=x.floorKey(timestamp);
        if(y==null) return "";
        return x.get(y);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */