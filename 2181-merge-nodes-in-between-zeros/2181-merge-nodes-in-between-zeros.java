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
    public ListNode mergeNodes(ListNode head) {
        if(head==null) return head;
        ListNode temp=head.next;
        ListNode head1 = new ListNode(-1);
        ListNode curr=head1;
        int sum=0;
        while(temp!=null)
        {
            if(temp.val!=0){
                sum=sum+temp.val;
            }
            else{
                 curr.next = new ListNode(sum);
                 curr=curr.next;
                 sum=0;
            }
            temp=temp.next;
        }
        return head1.next;
    }
}