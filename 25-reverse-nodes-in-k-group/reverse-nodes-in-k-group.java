/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        ListNode temp=head;
        int s=0;
        while(temp!=null){
            temp=temp.next;
            s++;
        }
        ListNode dummy=new ListNode(-1);
       ListNode xyz=dummy;
        temp=head;
       while(s>=k){
                int i=0;
                ListNode prev1=temp;
                ListNode prev=null;
            while(i<k){
                ListNode a=temp.next;
                temp.next=prev;
                prev=temp;
                temp=a;
                i++;
            }
           xyz.next=prev;
           xyz=prev1;
            s-=k;
        }
        xyz.next=temp;
        return dummy.next;
    }
    
}


// void reverse(ListNode x,ListNode y,ListNode p[]){
    //     if(x==null || y==null || x==y) return ;
    //     ListNode temp=x;
    //     ListNode dummy=new ListNode(-1);
    //     ListNode prev=dummy;
    //     while(temp!=y){
    //         // ListNode a=temp;
    //         // temp=temp.next;
    //         // a.next=prev;
    //         // prev=a;
    //     }
    //      dummy=dummy.next;
        // return prev;
        // p[0]=dummy;
        // p[1]=prev;
        // while(dummy!=prev){
        //     System.out.println(dummy.val);
        //     dummy=dummy.next;
        // }
        
    //}