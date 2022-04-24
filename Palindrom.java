package Week2.day1;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="MADAM";
String str2="";
int len=str1.length();

for(int i=len-1;i>=0;i--) {
	str2=str2+str1.charAt(i);
	
}
if(str1.equalsIgnoreCase(str2))
{
	System.out.println("it is palindrom"); 
	}
else{
	System.out.println("it is not a palindrom"); 
	}
	
}

	}


