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
    public int listSize(ListNode node){
      int count = 0;
      while(node!= null){
        count++;
        node = node.next;
      }
      return count;
    }

    public ListNode secondLast(ListNode head){
      ListNode node = head;
      ListNode secondLast = null;
      while(node!= null){
        if (node.next.next == null){
          secondLast = node;
          break;
        } 
        node = node.next;
      }
      return secondLast;
    }

    public ListNode rotateRight(ListNode head, int k) {
      if(head == null) return null;
      if(head.next == null) return head;

      int size = listSize(head);
      if(k>size) k = k % size;

      while(k!=0){
        ListNode secondLast = secondLast(head);
        ListNode last = secondLast.next;
        last.next = head;
        head = last;
        secondLast.next = null;
        k--;
      }
      return head;
        
    }
}