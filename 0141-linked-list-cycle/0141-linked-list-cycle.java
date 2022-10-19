/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode nextptr=null;
        ListNode curr=head;
        int i=1;
        
        HashSet<ListNode> ht = new HashSet<ListNode>();
        while(temp!=null)
        {
            
            if(ht.contains(temp))
            {
                return true;
            }
            ht.add(temp);
            temp=temp.next;
        }
        return false;
    }
}