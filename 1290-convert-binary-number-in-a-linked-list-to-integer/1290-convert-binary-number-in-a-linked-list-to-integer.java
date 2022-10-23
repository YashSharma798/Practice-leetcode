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
    public int getDecimalValue(ListNode head) {
        
        ArrayList<Integer> list =  new ArrayList<>();
        ListNode temp = head;
        
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        int n= list.size();
        n=n-1;
        int s=0,p;
        for(int i:list)
        {
            p=i* (int)Math.pow(2,n--);
            s=s+p;
        }
        return s;
    }
}