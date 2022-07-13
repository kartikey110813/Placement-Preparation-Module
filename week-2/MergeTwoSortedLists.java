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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return recursion(list1,list2);
    }
    
    
    public ListNode recursion(ListNode l1, ListNode l2)
    {
        if(l1 == null)
        {
        return l2;  
        }
        if(l2==null)
        {
            return l1;
        }
        if(l1.val>l2.val)
        {
            return new ListNode(l2.val,recursion(l1, l2.next));
        }
        else
        {
            return new ListNode(l1.val, recursion(l1.next, l2));  
        }
    }
}
