class Node {
      int val;
      Node next;
    Node   () {}
      Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }
  }

public class Nodes {
    public Node addTwoNumbers(Node l1, Node l2) {
            Node resultNode = new Node(0);
            Node current = resultNode;
            int carry = 0;
            while (l1 != null || l2!= null || carry != 0)
            {
                if (l1 != null)
                {
                    carry += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null)
                {
                 carry+= l2.val;
                 l2 = l2.next;
                }
                current.next = new Node(carry%10);
                carry /= 10;
                current = current.next;
    //            int x = l1!=null ? l1.val : 0;
    //            int y = l2!=null ? l2.val : 0;
    //            resultNode = new ListNode(x+y+carry,resultNode);
    //            if (x + y < 10) {
    //                resultNode.next = new ListNode(x + y + carry);
    //                System.out.println("If: " + (x + y + carry));
    //            }
    //            else  {
    //                resultNode.next = new ListNode((x+y) % 10);
    //                carry = 1;
    //                 System.out.println("Else: " + (x+y));
    //            }
    //              System.out.println("Current: " + resultNode.val);
    //            resultNode = resultNode.next;
    //            l1 = l1.next;
    //            l2 = l2.next;
    //            System.out.println("Next: " + resultNode.val);

            }

            return resultNode.next;
    }

    public static void main(String[] args) {
        Nodes nodes = new Nodes();
        Node listNode1 = new Node(2,new Node(4,new Node(3,new Node(4))));
        Node listNode2 = new Node(5,new Node(6,new Node(4,new Node(4))));
        System.out.println(nodes.addTwoNumbers(listNode1,listNode2));

    }
}