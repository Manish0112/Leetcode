/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode curr=node;
        
        if(curr != null){
           
            ListNode temp=curr.next;
            if(temp != null){
                curr.val = temp.val;
                curr.next=temp.next;
            }
            else{
                curr=temp;
            }  
       }
    }
}