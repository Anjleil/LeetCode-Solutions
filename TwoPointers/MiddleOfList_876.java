package AlgorithmsLeetCode_1.TwoPointers;

import Easy.ListNode;

public class MiddleOfList_876 {
    public ListNode middleNode(ListNode head) {
        int numbers = 1;
        ListNode result = new ListNode();
        result = head;
        while(head.next != null){
            numbers++;
            head = head.next;
        }
        for (int i = 0; i < (numbers/2); i++){
            result = result.next;
        }
        return result;
    }
}
