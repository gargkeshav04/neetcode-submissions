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
        ListNode left=head;
        ListNode count=head;
        int N=1;
        while(count.next!=null){
            N++;
            count=count.next;
        }
        n=N-n;
        
        if(n==0){
            head=left.next;
        }else{
            while(n>1){
            left=left.next;
            n--;
            }
            if(left.next!=null){
                left.next=left.next.next;
            }else{
                left.next=null;
            }
        }
        return head;
    }
}
