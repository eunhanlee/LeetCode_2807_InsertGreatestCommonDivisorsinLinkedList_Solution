package org.example;

public class Solution {
    /**
     * Inserts nodes with the greatest common divisor (GCD) values between adjacent nodes in the linked list.
     *
     * @param head The head node of the linked list.
     * @return The modified linked list with GCD nodes inserted.
     */
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode tempHead = head;

        while (tempHead.next != null) {
            tempHead.next = new ListNode(gcd(tempHead.val, tempHead.next.val), tempHead.next);
            tempHead = tempHead.next.next;
        }

        return head;
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers using the iterative approach.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The greatest common divisor (GCD) of the two input integers.
     */
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
