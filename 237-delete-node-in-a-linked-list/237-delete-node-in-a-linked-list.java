/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode curr = node;
        ListNode temp = curr.next;
        curr.val = temp.val;
        curr.next = temp.next;
    }
}