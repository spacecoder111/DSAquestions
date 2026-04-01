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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        Stack<ListNode> st=new Stack<>();
         ListNode curr=head;
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
        }
        int n=st.size();
        curr=head;
        for(int i=0;i<n/2;i++){
            ListNode newNode=st.pop();
            ListNode nextnode=curr.next;
            curr.next=newNode; 
            newNode.next=nextnode;
            curr=nextnode;
        }
        curr.next=null;
    }
}
