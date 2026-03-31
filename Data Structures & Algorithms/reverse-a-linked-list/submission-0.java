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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        Stack<ListNode> st=new Stack<>();
        while(head!=null){
            st.push(head);
            head=head.next;
        }
        ListNode dummyhead=new ListNode(0);
        ListNode temp=dummyhead;
        while(!st.isEmpty()){
            ListNode newNode=st.pop();
            temp.next=newNode; 
            temp=temp.next;
        }
        temp.next=null;
        return dummyhead.next;
    }
}
