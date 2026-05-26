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
         ListNode ans= null;
         while(head!=null){
            ListNode nextNode= head.next;//store next pointer
            head.next=ans; // point to reverse direction
            ans=head; // update the pointer
            head=nextNode; //move to next
         }

         return ans;
    }
}
