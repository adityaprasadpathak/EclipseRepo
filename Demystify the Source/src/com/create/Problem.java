package com.create;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.utils.comparator.MyComparatorForString;

public class Problem {
	
	public static void main(String[] args) {
		
		Map<Character, Integer> weight = new HashMap<>();
		weight.put('z', 1);
		weight.put('s', 2);
		weight.put('f', 3);
		weight.put('v', 4);
		weight.put('x', 5);
		weight.put('t', 6);
		weight.put('u', 7);
		weight.put('k', 8);
		weight.put('t', 9);
		weight.put('w', 10);
		weight.put('n', 11);
		weight.put('t', 12);
		weight.put('v', 13);
		weight.put('x', 14);
		weight.put('l', 15);
		weight.put('q', 16);
		weight.put('s', 17);
		weight.put('y', 18);
		weight.put('m', 19);
		weight.put('t', 20);
		weight.put('p', 21);
		weight.put('o', 22);
		weight.put('r', 23);
		weight.put('b', 24);
		weight.put('t', 25);
		weight.put('a', 26);
		
		
		List<String> al = new ArrayList<>();
		
		al.add("varsha");
		al.add("vtika");
		al.add("tina");
		al.add("fatima");
		al.add("sandhya");
		al.add("zubeda");
		al.add("xung");
		
		Collections.sort(al,new MyComparatorForString(weight));
		System.out.println(al);
		
		
		
	}

}
