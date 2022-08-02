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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count=0;
        ListNode prev = null;
        
        while(curr != null) {
            curr = curr.next;
            count++;
        }
        
        curr = head;
        int loop = count-n;
        
        if(loop == 0)
            return head.next;
        
        while(loop > 0){
            prev =curr;
            curr = curr.next;
            loop--;
        }
        prev.next = curr.next;
        return head;
        
    }
}
