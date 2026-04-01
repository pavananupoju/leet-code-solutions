/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution { 

    public static int len(ListNode head) 
    {  
        int l =0 ;
        while(head!=null) 
        {
            head = head.next;
            l++;
        }
        return l;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {  

   int a = len(headA);
   int b = len(headB) ;

   while(a>b) 
   {
    a--;
    headA=headA.next;
   }

   while(b>a)
   {
    b--;
    headB=headB.next;
   }
 while(headA!=headB) 
 {    headA = headA.next;
       headB = headB.next;
 }
 return headA;
        
    }
}