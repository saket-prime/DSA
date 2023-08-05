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

    int midOfNodes(ListNode head){
      int count = 0;
      while(head!=null){
        head = head.next;
        count++;
      }
      return count/2;
    }

    public ListNode middleNode(ListNode head) {
        int middle = midOfNodes(head);
        while(middle!=0){
          head = head.next;
          middle--;
        }
        return head;
    }
}