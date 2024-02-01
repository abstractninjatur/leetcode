package LinkedList;

public class ReverseLinkedList {


   public ListNode reverList(ListNode head) {

       ListNode prev = null;
       ListNode curr = head;
       while(curr !=null) {
           ListNode tmp = curr.next;
           curr.next = prev;

           prev = curr;
           curr = tmp;
       }


       return prev;

   }
}
