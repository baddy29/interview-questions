package two.sum.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSumMainClass {
	public static void main(String[] args) {
		int ar[] = { 3,3 };
		int sum = 6, arLength = ar.length;
		ArrayList<Integer> resList= new ArrayList<>();
		Set<Integer> numSet2 = new HashSet<>();

		for (int i = 0; i < arLength; i++) {
			int numToFind = sum - ar[i];
			if (numSet2.contains(numToFind)) {
				resList.add(ar[i]);
				resList.add(numToFind);
			}
			numSet2.add(ar[i]);
		}
		resList.forEach(z -> System.out.println(z));
		
		System.out.println("===");

		Solution solution = new Solution();
		int[] res = solution.twoSum(ar, sum);
		for (int x : res) {
			System.out.print(x + ", ");
		}
	}
}

class Solution {
	public int[] twoSum(int[] arr, int target) {
		{
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < arr.length; i++) {
				int diff = target - arr[i];

				if (map.containsKey(diff))
					return new int[] { map.get(diff), i };

				map.put(arr[i], i);
			}
			return new int[] {};
		}
	}

}

class j implements x {

}

interface x {
	default void o() {
		System.out.println("o");
	}
}

interface y {

}