package Week2.day1;

import org.apache.hc.core5.util.CharArrayBuffer;
import org.bouncycastle.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) {
		// 
		String str = "welcome to chennai";
		// declare and initialize a variable count to store the number of occurrences
		int count=0;
		char rep='e';
		//convert the string into char array
		char[] charArray = str.toCharArray();
		//get the length of the array
		int length = str.length();
		// traverse from 0 till the array length 
		for(int i=0;i<length;i++) {
		// Check the char array has the particular char in it 	
		if(charArray[i]==rep)
		{
		// if is has increment the count
			count++;
		}
	}
		// print the count out of the loop
		System.out.println("Char Occurance of 'e' is :" +count);
	}
}
