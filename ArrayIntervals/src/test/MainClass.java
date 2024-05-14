package test;

import java.util.Arrays;
import java.util.Stack;

public class MainClass {
	class Interval {
		int start;
		int end;

		Interval(int start, int end) {
			this.end = end;
			this.start = start;

		}
	}

	class Solution {

		Stack<Interval> mergeIntervals(Interval arr[]) {
			Stack<Interval> mergeStack = new Stack<>();
			Arrays.sort(arr, (o1, o2) -> {
				return o1.start - o2.start;
			});
			mergeStack.push(arr[0]);
			for (int i = 1; i < arr.length; i++) {
				if (mergeStack.peek().end < arr[i].start) {
					mergeStack.push(arr[i]);
				} else if (mergeStack.peek().end < arr[i].end) {
					mergeStack.peek().end = arr[i].end;
				}
			}
			return mergeStack;
		}
	}

//	static Solution s=new Solution();

	public static void main(String[] args) {
		MainClass m = new MainClass();
		Interval[] ar = new Interval[2];
		ar[0] = m.new Interval(22, 28);
		ar[1] = m.new Interval(25, 27);
//		ar[2]=m.new Interval(2,4);
//		ar[3]=m.new Interval(4,7);
//		ar[4]=m.new Interval(4, 5);

		Solution s = m.new Solution();

		Stack<Interval> res = s.mergeIntervals(ar);
		while (!res.isEmpty()) {
			Interval resInterval = res.pop();
			System.out.println("[" + resInterval.start + "," + resInterval.end + "]");
		}
	}

}
