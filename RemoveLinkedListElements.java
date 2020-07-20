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
class RemoveLinkedListElements{
    public ListNode removeElements(ListNode head, int val) {
        while(head !=null && head.val == val)
            head=head.next;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode dummy = temp;
        while(temp != null && temp.next!=null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        }

        return dummy.next;
    }
}