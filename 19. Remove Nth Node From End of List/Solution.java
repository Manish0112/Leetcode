/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        
        int length=0;
        ListNode temp = head;
        while(temp != null){
            ++length;
            temp=temp.next;
        }
       
        System.out.println("length: "+length);
        
        temp=dummy;
        int i=0;
        while(temp!=null){
            
            if(length-n == i){
                System.out.println("i: "+i);
                temp.next = temp.next.next;
                break;
            }
            else{
                i++;
                temp=temp.next;
            }
        }
        
        return dummy.next;
        
    }
}