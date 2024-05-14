package org.count.frequency;

import java.util.HashMap;
import java.util.Map;

public class CharCounterMain {
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		Map<Character,Integer> countMap=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(countMap.get(s.charAt(i))==null){
				countMap.put(s.charAt(i), 1);	
			}else {
				countMap.put(s.charAt(i), countMap.get(s.charAt(i))+1);
			}
		}
		for(Map.Entry<Character, Integer> mapPair:countMap.entrySet()) {
			System.out.print(mapPair.getKey()+""+mapPair.getValue());
		}
	}
}
