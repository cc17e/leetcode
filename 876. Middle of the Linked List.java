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
    public ListNode middleNode(ListNode head) {
        ListNode copy=head;
        ListNode ans=null;
        int n=0;
        while(copy!=null){
            copy=copy.next;
            n++;
        }
        n=n/2;
        for(int counter=0;counter<n;counter++){
            head=head.next;
        }
        ans=head;
        return ans;
    }
}
