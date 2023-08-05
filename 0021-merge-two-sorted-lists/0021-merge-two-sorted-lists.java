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

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head = list1;
        ListNode node = head;
        ListNode prev = null;

        while(list2!=null){
          if(node.val <= list2.val){
            prev = node;
            if(node.next!=null)node = node.next;
            else{
              node.next = list2;
              list2 = null;
            }
          } else {
            ListNode temp2 = list2.next;
            if(prev != null) prev.next = list2;
            else head = list2;
            list2.next = node;
            prev = list2;
            list2 = temp2;
          }
        }
        return head;
    }
}