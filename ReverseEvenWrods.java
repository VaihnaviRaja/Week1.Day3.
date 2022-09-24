package Week1.day3;

public class ReverseEvenWrods {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] test1= test.split(" ");
		for(int i=0;i<=test1.length-1;i++)
		{
			if(i%2==0)
			{
				char[] a= test1[i].toCharArray();
				for(int j=a.length-1;j>=0;j--)
				{
					System.out.println(a[j]);
				}		
			}
			else
				System.out.println(test1[i]);
		}
	}

}
