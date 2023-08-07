import org.example.ListNode;
import org.example.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    public void testInsertGreatestCommonDivisors() {
        Solution solution = new Solution();

        ListNode head1 = createLinkedList(10, 15, 20, 25);
        ListNode expected1 = createLinkedList(10, 5, 15, 5, 20, 5, 25);
        ListNode modifiedHead1 = solution.insertGreatestCommonDivisors(head1);
        assertTrue(compareLinkedLists(expected1, modifiedHead1));

        ListNode head2 = createLinkedList(3, 7, 14, 21);
        ListNode expected2 = createLinkedList(3, 1, 7, 7, 14, 7, 21);
        ListNode modifiedHead2 = solution.insertGreatestCommonDivisors(head2);
        assertTrue(compareLinkedLists(expected2, modifiedHead2));

        ListNode head3 = createLinkedList(1, 2, 3, 4);
        ListNode expected3 = createLinkedList(1, 1, 2, 1, 3, 1, 4);
        ListNode modifiedHead3 = solution.insertGreatestCommonDivisors(head3);
        assertTrue(compareLinkedLists(expected3, modifiedHead3));

        ListNode head4 = createLinkedList(6, 8, 10, 12);
        ListNode expected4 = createLinkedList(6, 2, 8, 2, 10, 2, 12);
        ListNode modifiedHead4 = solution.insertGreatestCommonDivisors(head4);
        assertTrue(compareLinkedLists(expected4, modifiedHead4));

        ListNode head5 = createLinkedList(9, 18, 27, 36);
        ListNode expected5 = createLinkedList(9, 9, 18, 9, 27, 9, 36);
        ListNode modifiedHead5 = solution.insertGreatestCommonDivisors(head5);
        assertTrue(compareLinkedLists(expected5, modifiedHead5));

        ListNode head10 = createLinkedList(5, 25, 125, 625);
        ListNode expected10 = createLinkedList(5, 5, 25, 25, 125, 125, 625);
        ListNode modifiedHead10 = solution.insertGreatestCommonDivisors(head10);
        assertTrue(compareLinkedLists(expected10, modifiedHead10));

        System.out.println("All test cases passed.");
    }

    private ListNode createLinkedList(int... values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private boolean compareLinkedLists(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return list1 == null && list2 == null;
    }
}
