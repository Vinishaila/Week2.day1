package Week2.day1;

public class OnlyTwordinString {

	public static void main(String[] args) {
		String Text0="Testleaf is situated in Twin towers Teynampet";
		
		String[] split = Text0.split(" ");
		int length = split.length;
		for(int i=0;i<length;i++)
		{
			
			
			if(split[i].startsWith("T")|| split[i].startsWith("t"))
			{
				System.out.println(split[i]);		
				
			}
			
		}
	
		}
	}


