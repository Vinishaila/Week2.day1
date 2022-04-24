package Week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declare a String text1 = "stops"
		String str1="stops";
		//Declare a String text1 = "potss"
		String str2="potss";
		int length1 = str1.length();
		int length2 = str2.length();
		//Check length of the strings are same then (Use A Condition)
		if(length1==length2)
		{
			//Convert both Strings in to characters
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			//Sort Both the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			//Check both the arrays has same value
			if(Arrays.equals(charArray1,charArray2))
			{
			System.out.println("This is an Anagram");	
			}
			
		}
		else
		{
			System.out.println("This is not an Anagram");	
		}
	}

}
