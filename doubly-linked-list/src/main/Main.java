package main;

public class Main {

	class DoublyNode {
		int data;
		DoublyNode next;
		DoublyNode prev;

		DoublyNode(int data) {
			this.data = data;
		}
	}

	class DoublyListOp {

		DoublyNode head;
		DoublyNode tail;

		public DoublyNode insertDoublyNode(int data) {
			DoublyNode newNode = new DoublyNode(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
			}
			return tail;
		}

		public DoublyNode deleteDoublyNode(int data) {
			if (head == null)
				System.out.println("Empty");
			else {
				DoublyNode temp = head;
				while (temp.data != data)
					temp = temp.next;
				if (temp.prev != null && temp.next != null) {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				} else if (temp.prev == null) {
					temp.next.prev = null;
					temp = temp.next;
					head = temp;

				} else if (temp.next == null) {
					temp.prev.next = null;
					temp = temp.prev;
					tail = temp;
				}
			}
			return head;
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		DoublyListOp op = m.new DoublyListOp();
		DoublyNode head = op.insertDoublyNode(1);
		head = op.insertDoublyNode(2);
		head = op.insertDoublyNode(3);
		head = op.insertDoublyNode(4);
		head = op.insertDoublyNode(5);
		DoublyNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
		head = op.deleteDoublyNode(2);
		DoublyNode temp2 = head;
		System.out.println("===========");
		while (temp2 != null) {
			System.out.println(temp2.data);
			temp2 = temp2.next;
		}

	}

}
