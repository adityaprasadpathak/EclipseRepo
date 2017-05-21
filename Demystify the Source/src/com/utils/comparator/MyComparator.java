package com.utils.comparator;

import java.util.Comparator;
import java.util.Map;

public class MyComparator implements Comparator<Character>
{
	Map<Character, Integer> weight;
	public MyComparator(Map<Character, Integer> weight) {
		this.weight = weight;
	}
	@Override
	public int compare(Character o1, Character o2) {
		Integer wo1 = weight.get(o1);
		Integer wo2 = weight.get(o2);
		
		return wo1 - wo2;
	}
	
}