/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1= headA;
        ListNode node2= headB;

        HashSet<ListNode> set = new HashSet<>();

        while( node1 != null){
            set.add(node1);
            node1 = node1.next;
        }

        while(node2 != null){
            if(set.contains(node2)){
                return node2;
            }

            node2 = node2.next;
        }

        return null;


        

    }
}