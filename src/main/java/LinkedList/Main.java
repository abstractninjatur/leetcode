package LinkedList;

public class Main {
    public static void main(String[] args) {


            MoveTheZeros m = new MoveTheZeros();
            int[] val = m.moveZeros(new int[]{0,1,0,2,3,4});

            for(int v : val){
                System.out.print(v+" ");

            }


//
//        ListNode dummy = new ListNode(-1);
//        ListNode t = dummy;
//
//
//        int[] data = {1,2,3,4};
//
//        for(int d : data) {
//            dummy.next  = new ListNode(d);
//            dummy = dummy.next;
//        }
//
//        System.out.println(new FindMiddleOfLinkedList().findMiddle(t.next).val);
//
//        ListNode reversedList = new ReverseLinkedList().reverList(t.next);
//        ListNode ptr = reversedList;
//
//        while(ptr!=null) {
//            System.out.print(ptr.val+"-->");
//            ptr = ptr.next;
//        }


    }
}