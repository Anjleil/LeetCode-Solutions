package InProgress;

import Easy.ListNode;

public class Merge_21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(3));
        ListNode l2 = new ListNode(1);
        Merge_21 solutioner = new Merge_21();
        ListNode ans = solutioner.mergeTwoLists(l1,l2);
        while(ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        else if (list1 == null) return list2;
        else if (list2 == null) return list1;

        ListNode buffer = new ListNode();
        ListNode mergedListHead = list1.val <= list2.val ? list1 : list2;
        if (list2.next == null){
            mergedListHead.next = list1;
        }
        list1.next = list2;
        return mergedListHead;
    }

    ListNode exist(ListNode l){
        if (l.next != null){
            l = l.next;
        } else return null;
        return l;
    }
}
