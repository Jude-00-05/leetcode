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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int middle = -1;
        // if ((count + 1) % 2 == 0) {
        //     count++;
        //     middle = count / 2;
        // } else {
        //     count += 2;
        //     middle = count / 2;
        // }
        middle=count/2+1;
        temp = head;
        int i = 1;
        while (i < middle) {
            temp = temp.next;
            i++;
        }
        return temp;

    }
}