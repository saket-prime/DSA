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
    // public Stack<ListNode> stackOfNodes(ListNode node){

    //   Stack<ListNode> nodes = new Stack<>();
    //   while(node != null){
    //     nodes.push(node);
    //     node = node.next;
    //   }
    //   return nodes;
    // }

    public ListNode reverseList(ListNode head) {
      // if (head == null) return head;
      //   Stack<ListNode> nodes = stackOfNodes(head);
      //   head = nodes.pop();
      //   ListNode node = head;
      //   while(!nodes.isEmpty()){
      //     node.next = nodes.pop();
      //     if(nodes.isEmpty()) node.next.next = null;
      //     node = node.next;
      //   }
      //   return head;
      if (head == null) return head;
      
      ListNode curr = head;
      ListNode currNext = null;
      ListNode prev = null;

      while(curr!=null){
        currNext = curr.next;
        curr.next = prev;
        prev = curr;
        curr = currNext;
      }
      return prev;
    }
}