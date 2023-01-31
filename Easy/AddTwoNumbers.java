package Easy;

public class ListNode {
    public int val;
      public ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(8));
        ListNode l2 = new ListNode(0);
        AddTwoNumbers solutioner = new AddTwoNumbers();
        ListNode ans = solutioner.addTwoNumbers(l1,l2);
        while(ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode copy = ans;

        while (ans != null){
            ans.val += l1.val + l2.val;
            if (ans.val > 9){
                ans.next = new ListNode(1);
                ans.val -= 10;
            } else if (l1.next != null || l2.next != null){
                ans.next = new ListNode(0);
            }
            ans = ans.next;
            l1 = exist(l1);
            l2 = exist(l2);
        }
        return copy;
    }

    ListNode exist(ListNode l){
        if (l.next != null){
            l = l.next;
        } else l.val = 0;
        return l;
    }
}
