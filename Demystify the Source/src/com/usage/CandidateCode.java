package com.usage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CandidateCode {
	
	 /*public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int output = 0;
	        int ip1_size = 0;
	        ip1_size = Integer.parseInt(in.nextLine().trim());
	        String[] ip1 = new String[ip1_size];
	        String ip1_item;
	        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
	            try {
	        ip1_item = in.nextLine();
	            } catch (Exception e) {
	        ip1_item = null;
	            }
	            ip1[ip1_i] = ip1_item;
	        }
	        String ip2 = in.nextLine().trim();
	        output = Decryption_problem(ip1,ip2);
	        System.out.println(String.valueOf(output));
	    }*/
	
	
	 public static int Decryption_problem(String[] arr,String s1)
	 {
		 
		 List<String> al = new ArrayList<>(Arrays.asList(arr));
			al.add(s1);
			Map<Character, Integer> weight = new HashMap<>();
			check(arr,weight);
			System.out.println(weight);
			
			for(int i=0;i<arr.length;i++)
			{
				char [] c1 = arr[i].toCharArray();
				char [] c2 = s1.toCharArray();
				int minL = Math.min(c1.length, c2.length);
				//System.out.println("Cheking for "+arr[i]+" and "+s1);
				
				int index = 0 ;
				
				while(index < minL)
				{
					char char1 = c1[index];
					char char2 = c2[index];
				if(char1 != char2)
				{
					//System.out.println("At index "+index+" "+char1+" and "+char2+" dont match");
					Integer c11 = weight.get(char1);
					Integer c21 = weight.get(char2);
					if(c11 == null)
					{
						System.out.println("Character "+char1+ " is missing in input");
						System.exit(char1);
					}
					
					if(c21 == null)
					{
						System.out.println("Character "+char2+ " is missing in input");
						System.exit(char2);
					}
					
					if(c11 > c21)
					{
						//System.out.println(c1+"is greater than "+c2+" so "+k);
						//System.out.println("------------------------------------------------");
						return i;
					}else
					{
						//System.out.println("But "+c1[k]+" is less than " +c2[k]);
						//System.out.println("------------------------------------------------");
						index++;
						//continue;
						break;
					}
				}
				index++;
					
				}
				
				
			}
			
			if(s1.length() < arr[1].length())
			{
				return 0;
			}
			
			//Collections.sort(al,new MyComparatorForString(weight));
			//System.out.println(al);
			//return al.indexOf(s1);
			return arr.length + 1;
	 }
	 
	public static void main(String[] args) {
		try{
		/*String s1 = "ax";
		String s2 = "xb";
		String s3 = "cx";
		String s4 = "bb";*/
		
		String [] arr = {"zubeda", "fatima", "vtika", "xung" , "sandhya", "tina"};
			
		System.out.println(Decryption_problem(arr, "vtia"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	/*public static int decrypt(String [] arr , String s1)
	{
		List<String> al = new ArrayList<>(Arrays.asList(arr));
		al.add(s1);
		Map<Character, Integer> weight = new HashMap<>();
		check(arr,weight);
		//System.out.println(weight);
		
		Collections.sort(al,new MyComparatorForString(weight));
		//System.out.println(al);
		return al.indexOf(s1);
		
	}*/

	private static void check(String[] arr, Map<Character, Integer> weight) {
		int alphabetValues = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			int index=0;
			char [] s1 = arr[i].toCharArray();
			char [] s2 = arr[i+1].toCharArray();
			
			int minL = Math.min(s1.length, s2.length);
			while(index < minL)
			{
				char c1 = s1[index];
				char c2 = s2[index];
				if(c1 != c2)
				{
					if(weight.get(c1) == null)
					{
						//System.out.println(c1 +" times " + alphabetValues);
						weight.put(c1, alphabetValues);
						alphabetValues += 1;
					}
					
					if(weight.get(c2) == null)
					{
						//System.out.println(c2 +" times " + alphabetValues);
						weight.put(c2, alphabetValues);
						alphabetValues += 1;
					}
					break;
				}
				index++;
			}
		}
		
	}

}

/*class MyComparator implements Comparator<Character>
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



class MyComparatorForString implements Comparator<String> {
	
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
}*/