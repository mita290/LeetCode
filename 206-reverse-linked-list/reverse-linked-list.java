/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode tail;
    public static boolean flag;
    public ListNode reverseList(ListNode head) {
        // if (head == null || head.next == null) {
        //     return head;
        // }
        // ListNode curr = head;
        // ListNode nextn = head.next;
        // ListNode prev = null;

        // while (nextn != null) {
        //     curr.next = prev;
        //     prev = curr;
        //     curr = nextn;
        //     nextn = nextn.next;
        // }
        // curr.next = prev;
        // return curr;
        
        if (head == null || head.next == null) return head;
        tail = head;
        flag = false;
        helper(head);
        return head;

    }
    public static void helper(ListNode list) {
        if (list == null ) return;
        helper(list.next);

        if (flag == true) return;

        int n = tail.val;
        tail.val = list.val;
        list.val = n;
        tail = tail.next;
        if (tail == list || tail.next == list) flag = true;
    }
}