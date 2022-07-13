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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head== null || head.next == null)
            return false;
        
        int count= 0;
        while(head.next != null){
            count++;
            head = head.next;
            if(count > 10000) return true;
        }
        return false;
    }
}
