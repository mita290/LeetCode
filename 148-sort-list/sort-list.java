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
    public ListNode combineSortedLists(ListNode n1, ListNode n2) {
        ListNode tempHead = new ListNode(-1, null);
        ListNode x = tempHead;
        while (n1 != null && n2 != null) {
            if (n1.val <= n2.val) {
                x.next = n1;
                n1 = n1.next;
            } else {
                x.next = n2;
                n2 = n2.next;
            }
            x = x.next;
        }
        if (n1 != null) {
            x.next = n1;
        } else {
            x.next = n2;
        }
        return tempHead.next;
    }
    public ListNode findMid(ListNode head) {
        if (head  == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = findMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sort(left);
        right = sort(right);
        return combineSortedLists(left, right);
    }
    public ListNode sortList(ListNode head) {
        return sort(head);

        // brute force
    //     ListNode temp = head;
    //     ArrayList<Integer> al = new ArrayList<>();
    //     while (temp != null) {
    //         al.add(temp.val);
    //         temp = temp.next;
    //     }
    //     Collections.sort(al);
    //     temp = head;
    //     int i = 0;
    //     while (temp != null) {
    //         temp.val = al.get(i);
    //         temp = temp.next;
    //         i++;
    //     }
    //     return head;
    // }
    }
}