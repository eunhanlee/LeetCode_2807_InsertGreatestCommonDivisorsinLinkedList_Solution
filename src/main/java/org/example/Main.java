package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();
        ListNode list = new ListNode(18);
        list.next = new ListNode(6);
        list.next.next = new ListNode(10);
        list.next.next.next = new ListNode(3);

        tt.insertGreatestCommonDivisors(list);

        while (list != null) {
            System.out.print(list.val+" ");
            list = list.next;
        }
    }
}