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
    ListNode curr;
    public boolean isPalindrome(ListNode head) {
        // iterative
        // Stack<Integer> st = new Stack<>();
        // ListNode curr = head;
        // while (curr != null) {
        //     st.push(curr.val);
        //     curr = curr.next;
        // }
        // curr = head;
        // while (curr != null && curr.val == st.pop()) {
        //     curr = curr.next;
        // }
        // return curr == null;

        // recursive

        curr = head;
        return solve(head);
    }

    public boolean solve(ListNode head) {
        if (head == null) {
            return true;
        }
        boolean ans = solve(head.next) && head.val == curr.val;
        curr = curr.next;
        return ans;
    }
}