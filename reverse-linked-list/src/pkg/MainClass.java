package pkg;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int key) {
		data = key;
		next = null;
	}
}

class MainClass {
	Node head;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			Node tail = head;
			for (int i = 1; i < n; i++) {
				int a = sc.nextInt();
				// addToTheLast(new Node(a));
				tail.next = new Node(a);
				tail = tail.next;
			}

			int k = sc.nextInt();
			Solution ob = new Solution();
			Node res = ob.reverse(head, k);
			printList(res);
			System.out.println();
		}
	}

	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}

class Solution {
	public Node reverse(Node head, int k) {
		 // If head is NULL or K is 1 then return head
        if (head == null || head.next == null)
            return head;
 
        // creating dummy node
        Node dummy = new Node(-1);
        dummy.next = head;
 
        // Initializing three points prev, curr, next
        Node prev = dummy;
        Node curr = dummy;
        Node next = dummy;
 
        // Calculating the length of linked list
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
 
        // Iterating till next is not NULL
        while (next != null) {
            curr = prev.next; // Curr position after every
                              // reverse group
            next = curr.next; // Next will always next to
                              // curr
            int toLoop
                = count > k
                      ? k
                      : count - 1; // toLoop will set to
                                   // count - 1 in case of
                                   // remaining element
 
            for (int i = 1; i < toLoop; i++) {
                // 4 steps as discussed above
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr; // Setting prev to curr
            count -= k; // Update count
        }
        return dummy.next; // dummy -> next will be our new
                           // head for output linked
        // list
	}
}
