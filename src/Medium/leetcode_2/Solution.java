package Medium.leetcode_2;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = 0;
        ListNode ans = new ListNode(0);
        ListNode cursor = ans;
        while(l1 != null || l2 != null || tmp != 0){
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + tmp;
            tmp = sumVal / 10;

            ListNode node = new ListNode(sumVal % 10);
            cursor.next = node;
            cursor = node;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode ans = addTwoNumbers(l1,l2);

        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
