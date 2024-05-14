package org.pkg.nummax;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {
	public static void main(String[] args) {
		
		String s[]= {"12","2","12","644","5"};
		Map<Character,String> numMap=new TreeMap<Character,String>(Collections.reverseOrder());
		
		for(String x:s) {
			numMap.put(x.charAt(0), x);
		}
		for(Map.Entry<Character, String> entry:numMap.entrySet()) {
			System.out.print(entry.getValue());
		}
	}
}
