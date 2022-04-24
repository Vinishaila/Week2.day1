package Week2.day1;

public class NumOfE_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Text0="TestLeaf";
int length = Text0.length();
int count=0;
for (int i=0;i<length;i++)
{
	
	if(Text0.charAt(i)=='e')
		 {
		count=count+1;
	}
}

System.out.println("Number of e is:"+count);
	}

}
