package com.utils.comparator;

import java.util.Comparator;
import java.util.Map;


public class MyComparatorForString implements Comparator<String> {
	
	Map<Character, Integer> weight;
	public MyComparatorForString(Map<Character, Integer> weight) {
		this.weight = weight;
	}

	@Override
	public int compare(String o1, String o2) {
		MyComparator comp = new MyComparator(weight);
		int index=0;
		char [] s1 = o1.toCharArray();
		char [] s2 = o2.toCharArray();
		
		
		int minL = Math.min(s1.length, s2.length);
		while(index < minL)
		{
			char c1 = s1[index];
			char c2 = s2[index];
			
			if(c1 != c2)
			{
				return comp.compare(c1, c2);
			}
			index++;
		}
		return s1.length - s2.length;
	}
}