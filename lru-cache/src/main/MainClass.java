package main;

import java.util.HashMap;

public class MainClass {

	class DoublyNode {
		int data;
		int key;
		DoublyNode next;
		DoublyNode prev;

		DoublyNode(int key,int data) {
			this.data = data;
			this.key=key;
		}
	}

	class LruCache {
		int capacity;
		HashMap<Integer, DoublyNode> cacheMap ;
		DoublyNode head;
		DoublyNode tail;

		public LruCache(int capacity) {
			this.capacity = capacity;
			cacheMap=new HashMap<>(capacity);
			System.out.print("null, ");
		}

		public DoublyNode add(DoublyNode node) {

			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				node.prev = tail;
				tail = node;
			}
			return head;
		}

		public int remove() {
			int delValKey ;
			DoublyNode temp= head;
			delValKey=temp.key;
				temp = temp.next;
				temp.prev=null;
				head = temp;
				return delValKey;
			}
	
			public int get(int key) {
				if (!cacheMap.containsKey(key))
					return -1;
				remove();
				add(cacheMap.get(key));
			return cacheMap.get(key).data;
		}

		public void put(int key, int data) {
			capacity--;
			if (capacity<0) {
				int keyToBeRemoved=remove();
				cacheMap.remove(keyToBeRemoved);
			}
			DoublyNode newNode = new DoublyNode(key,data);//{1=(0,1,0)<--head,tail} , {1}--><---{2=(0,2,0)<--tail}
			add(newNode);
			cacheMap.put(key,newNode);
			System.out.print("null ,");
		}
	}

	public static void main(String[] args) {
		MainClass m = new MainClass();
		LruCache lruCache = m.new LruCache(2);
		lruCache.put(1, 1);
		lruCache.put(2, 2);
		System.out.print(lruCache.get(1) + ", ");
		lruCache.put(3, 3);
		System.out.print(lruCache.get(2) + ", ");
		lruCache.put(4, 4);
		System.out.print(lruCache.get(1) + ", ");
		System.out.print(lruCache.get(3) + ", ");
		System.out.print(lruCache.get(4) + ", ");

	}

}
