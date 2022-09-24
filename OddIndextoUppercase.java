package Week1.day3;

public class OddIndextoUppercase {

	public static void main(String[] args) {
		String str="changeme";
		char[] charArray = str.toCharArray();
		
		System.out.println(charArray);		
		for(int i=0;i<=charArray.length-1;i++)
		{
			if(charArray[i]%2!=0)
			{
				char c=charArray[i];
				char Uppercase = Character.toUpperCase(c);
				System.out.println(Uppercase);
			}
						
		}
	}

}
