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
    public ListNode rotateRight(ListNode head, int k) {
        int len = 1;
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode curr = head;

        while(curr.next != null){
            len++ ;
            curr = curr.next;
        }

        curr.next = head;
        
        k = k % len;

        ListNode tail = head;

        for(int i=0;i< len - k - 1; i++){
            tail = tail.next;
        }
        ListNode newHead = tail.next;
        tail.next = null;


        return newHead;




        
        
    }
}