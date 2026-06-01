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
      ArrayList<ListNode> saved= new ArrayList<>();

      ListNode temp = head;

     while(temp!=null){
      saved.add(temp);
      temp = temp.next;
     }

     int size=saved.size();

     if (size - n == 0) {
        return head.next;
    }


     ListNode toRemove= saved.get(size-n-1);

     if(n==1){
      toRemove.next=null;
     }else{
      System.out.println(saved.get(size-n+1).val);
      toRemove.next=saved.get(size-n+1);
     }

   return head;
    }

    
   
}
