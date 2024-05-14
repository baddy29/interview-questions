package org.string.distance;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainClass2 {
	public static void main(String[] args) {
		String s = "he quick the brown quick brown the frog";
		String findWord="brown";
		String[] s1=s.split(" ");
		HashMap<String, Integer> m = new HashMap<>();
		for (int i = 0; i < s1.length; i++) {
			if(m.containsKey(s1[i])) {
				m.put(s1[i], i-m.get(s1[i])-1);
			}
			else {
				m.put(s1[i],i);
			}
		}
		Iterator<Map.Entry<String, Integer>> iter= m.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> iterKey=(Map.Entry<String, Integer>)iter.next();
			if(iterKey.getKey().equals(findWord)) {
				System.out.println(m.get(iterKey.getKey()));
				break;
			}
			
		}
	}
}
