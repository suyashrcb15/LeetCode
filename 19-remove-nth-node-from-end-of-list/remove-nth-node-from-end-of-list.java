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
        int len = 0;
        ListNode current=head;
        while (current!=null) {
            len++;
            current=current.next;
        }
        if(n>len){
            return head;
        }
        if(n==len){
            return head.next;
        }
        current=head;
        for(int i=0;i<len-n-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
        return head;
    }
}