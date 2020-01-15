package 链表;

public class _141_环形链表 {
	public class Solution {
		public boolean hasCycle(ListNode head) {
	    	if(head == null || head.next == null) return false;
	    	ListNode fast = head.next;
	    	ListNode slow = head;
	    	while(fast != null && fast.next != null) {
	    		if(slow == fast) return true;
	    		slow = slow.next;
	    		fast = fast.next.next;
	    	}
	        return false;
	    }
	}
}
