class DLL{
        int key;
        int val;
        DLL prev;
        DLL next;
        public DLL(int key,int val){
            this.key=key;
            this.val=val;
            this.prev=null;
            this.next=null;
        } 
         public DLL(int key,int val,DLL x,DLL y){
            this.key=key;
            this.val=val;
            this.prev=x;
            this.next=y;
        } 
}

class LRUCache {

    DLL head;
    Map<Integer,DLL> map;
    int n;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        head=new DLL(-1,-1);
        map.put(-1,head);
        n=capacity;
    }
    public int get(int key) {
         DLL temp=head;
         if(!map.containsKey(key)){
           return -1;
         }
         if(map.get(key)!=head){
            DLL x=map.get(key);
            DLL y=x.prev;
            DLL z=x.next;
            if(y!=null) y.next=z;
            if(z!=null) z.prev=y;
            head.next=x;
            x.prev=head;
            x.next=null;
            head=x;
         }
        return map.get(key).val;
    }
    
    public void put(int key, int value) {
        DLL temp=head;
        if(!map.containsKey(key)){
         if(n>0){
          n--;
         }else{
            DLL a=map.get(-1);
            DLL x=a.next;
            if(x!=null) {
                if(x.key==head.key && x.val==head.val) {
                 System.out.println(true);
                head=a;
            }
            DLL z=x.next;
            map.remove(x.key);
            a.next=z;
            if(z!=null) z.prev=a;
            }
         }
         DLL x=new DLL(key,value);
          head.next=x;
          x.prev=head;
          map.put(key,x);
          head=x;
        }else{
            DLL x=map.get(key);
            x.val=value;
            if(x!=head){
            DLL y=x.prev;
            DLL z=x.next;
            if(y!=null) y.next=z;
            if(z!=null) z.prev=y;
            head.next=x;
            x.prev=head;
            x.next=null;
            head=x;
            }
            map.put(key,x);
        }
    }
}

// /**
//  * Your LRUCache object will be instantiated and called as such:
//  * LRUCache obj = new LRUCache(capacity);
//  * int param_1 = obj.get(key);
//  * obj.put(key,value);
//  */

// //   st++;
// //         //System.out.println(key+","+map.get(key).val+" "+st);
// //         System.out.println(map.size());
// //         System.out.println(temp.key+","+temp.val+" "+st);


// import java.util.*;

// class DLL {
//     int key;
//     int val;
//     DLL prev;
//     DLL next;
    
//     public DLL(int key, int val) {
//         this.key = key;
//         this.val = val;
//         this.prev = null;
//         this.next = null;
//     } 
    
//     public DLL(int key, int val, DLL x, DLL y) {
//         this.key = key;
//         this.val = val;
//         this.prev = x;
//         this.next = y;
//     } 
// }

// class LRUCache {
//     // This head reference MUST always point to the dummy node (-1, -1)
//     final DLL head; 
//     final Map<Integer, DLL> map;
//     int n;

//     public LRUCache(int capacity) {
//         map = new HashMap<>();
//         head = new DLL(-1, -1);
//         map.put(-1, head);
//         n = capacity;
//     }
    
//     public int get(int key) {
//         if (!map.containsKey(key)) {
//             return -1;
//         }
        
//         DLL x = map.get(key);
//         // Step 1: Detach node x from its current position
//         DLL y = x.prev;
//         DLL z = x.next;
//         if (y != null) y.next = z;
//         if (z != null) z.prev = y;
        
//         // Step 2: Insert node x right after the dummy head node
//         DLL first = head.next;
//         head.next = x;
//         x.prev = head;
//         x.next = first;
//         if (first != null) first.prev = x;
        
//         return x.val;
//     }
    
//     public void put(int key, int value) {
//         if (!map.containsKey(key)) {
//             if (n > 0) {
//                 n--;
//             } else {
//                 // Evict the least recently used node (the very last node in the chain)
//                 DLL curr = head;
//                 while (curr.next != null) {
//                     curr = curr.next;
//                 }
//                 // curr is now the oldest node. Remove it from list and map
//                 if (curr != head) { // Ensure we don't remove the dummy head
//                     map.remove(curr.key); // CRITICAL: Changed from curr.val to curr.key
//                     if (curr.prev != null) {
//                         curr.prev.next = null;
//                     }
//                 }
//             }
            
//             // Create and insert new node right after the dummy head
//             DLL x = new DLL(key, value);
//             DLL first = head.next;
//             head.next = x;
//             x.prev = head;
//             x.next = first;
//             if (first != null) first.prev = x;
            
//             map.put(key, x);
//         } else {
//             // Update existing key value
//             DLL x = map.get(key);
//             x.val = value;
            
//             // Detach from current position
//             DLL y = x.prev;
//             DLL z = x.next;
//             if (y != null) y.next = z;
//             if (z != null) z.prev = y;
            
//             // Move to the front (right after dummy head)
//             DLL first = head.next;
//             head.next = x;
//             x.prev = head;
//             x.next = first;
//             if (first != null) first.prev = x;
//         }
//     }
// }
