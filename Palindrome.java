package Week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		String str="Madam",rev="";
		int length=str.length();
		for(int i=(length-1);i>=0;--i)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println(str);
		System.out.println(rev);
		 if (str.equalsIgnoreCase(rev)) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		}
	}
	}


