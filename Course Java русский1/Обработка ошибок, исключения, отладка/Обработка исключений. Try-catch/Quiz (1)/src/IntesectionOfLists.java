class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
  
public class IntesectionOfLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode first = headA;
        ListNode second = headB;
        while (first!=second)
        {
           if (first != null)
               first = first.next;
           if (second != null)
               second = second.next;
        }
        return first;
    }

    public static void main(String[] args) {
        IntesectionOfLists intesectionOfLists = new IntesectionOfLists();
    }
}