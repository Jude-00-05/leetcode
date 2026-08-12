class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyhead=new ListNode(-1);
        dummyhead.next=head;
        ListNode curr=dummyhead.next;
        ListNode leftprev=dummyhead;
        for(int i=1;i<left;i++){
            curr=curr.next;
            leftprev=leftprev.next;
        }
        ListNode lefthead=curr;
        ListNode prev=null;
        for(int i=0;i<right-left+1;i++){
            ListNode next_pointer=curr.next;
            curr.next=prev;
            ListNode temp=curr;
            prev=temp;
            curr=next_pointer;
        }
        leftprev.next = prev;
        lefthead.next = curr;
        return dummyhead.next;
    }
}