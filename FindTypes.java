package Week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		//Convert the String to character array
		char[] charArray = test.toCharArray();
		int length = test.length();
		//Traverse through each character (using loop)
		for(int i=0;i<length;i++)
		{
			//Find if the given character is what type using (if)
			char cha= test.charAt(i);
			
			//Character.isLetter
			if(Character.isAlphabetic(cha))
			{
			//System.out.println("The character "+cha+" is Alphabet");	
			letter++;	
			}
			//Character.isDigit
			else if(Character.isDigit(cha))
			{
				//System.out.println("The character "+cha+" is Digit");	
				num++;
			}
			//Character.isSpaceChar
			else if(Character.isSpaceChar(cha))
			{
				
				//System.out.println("The character "+cha+" is Space");
				space++;
			}
			//else -> consider as special character
			else
			{
				//System.out.println("The character "+cha+" special character");
				specialChar++;
			}
			
		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
