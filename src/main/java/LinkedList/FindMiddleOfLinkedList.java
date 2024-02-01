package LinkedList;

public class FindMiddleOfLinkedList {

    public ListNode findMiddle(ListNode head){

        ListNode ptr1 = head;
        ListNode ptr2 = head;

        while(ptr2!=null && ptr2.next !=null ){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }

        return ptr1;
    }
}
