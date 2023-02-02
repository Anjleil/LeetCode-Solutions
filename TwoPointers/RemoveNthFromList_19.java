package AlgorithmsLeetCode_1.TwoPointers;

import Easy.ListNode;

import java.util.Arrays;

public class RemoveNthFromList_19 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2));
        RemoveNthFromList_19 solutioner = new RemoveNthFromList_19();
        solutioner.removeNthFromEnd(l1, 2);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode copy = head;
        ListNode result = copy;
        int numbers = 1;
        while(head.next != null){
            numbers++;
            head = head.next;
        }
        if (numbers == 1)
            return null;
        if (numbers == n){
            return copy.next;
        }
        for (int i = 0; i < numbers - n - 1; i++){
            copy = copy.next;
        }
        if (copy.next == null){
            copy = null;
        } else
            copy.next = copy.next.next;
        return result;
    }
}
