package org.pkg.nummax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainClass2 {
	public static void main(String[] args) {

		String s[] = { "12", "12","2", "644", "5" };
		Map<Character, String> numMap = new TreeMap<Character, String>(Collections.reverseOrder());
		String dupes=new String();
		Map<String,Integer> freqmap=new HashMap<>();
		for(String x : s) {
			if(freqmap.get(x)!=null && freqmap.get(x)>0) {
				freqmap.put(x, freqmap.get(x)+1);
			}else {
				freqmap.put(x, 1);
			}
		}

		for (String x : s) {
			if(freqmap.get(x)>1) {
				for(int i=0;i<freqmap.get(x);i++) {
					dupes+=x;
				}
			}else {
				dupes+=x;
			}
			numMap.put(x.charAt(0), dupes);
			dupes="";
		}
		for (Map.Entry<Character, String> entry : numMap.entrySet()) {
			System.out.print(entry.getValue());
		}
	}
}
