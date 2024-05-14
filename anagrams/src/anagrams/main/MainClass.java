package anagrams.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
	class Solution {
	    public boolean isAnagram(String s, String t) {
	        
	        HashMap<Character,Integer> valMap1=new HashMap<>();
	        HashMap<Character,Integer> valMap2=new HashMap<>();
	        char[] sChars=s.toLowerCase().toCharArray();
	        char[] tChars=t.toLowerCase().toCharArray();
	        boolean anagramExists=true;
	        for(char c : sChars){
	            if(valMap1.containsKey(c))
	                valMap1.put(c,valMap1.get(c)+1);
	            else   
	                valMap1.put(c,1);
	        }
	        
	        for(char c : tChars){
	            if(valMap2.containsKey(c))
	                valMap2.put(c,valMap2.get(c)+1);
	            else   
	                valMap2.put(c,1);
	        }
	        
	        for(Map.Entry<Character,Integer> entry:valMap1.entrySet()){
	            if(sChars.length==tChars.length && valMap2.containsKey(entry.getKey()) && valMap2.get(entry.getKey()) == entry.getValue()){
	                continue;
	            }else{
	                anagramExists=false;
	                break;
	            }
	        }
	        return anagramExists;
	    }
	}
	
	public static void main(String[] args) {
		MainClass m=new MainClass();
		Solution s=m.new Solution();
		System.out.println(s.isAnagram("a", "ab"));
	}
}
