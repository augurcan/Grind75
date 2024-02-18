package Week1;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head){
        ListNode slowPointer= head, fastPointer=head;
        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
            if(slowPointer==fastPointer) return true;
        }
        return false;
    }
}
