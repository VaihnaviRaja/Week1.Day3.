package Week1.day3;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="We learn Java basics as part of Java sessions in Java Week1";
		String[] words = text.split(" ");
		String result= " ";
		System.out.println("The original String:" +text);
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i]==words[j])
				{
					words[i]="remove";
				}
			}
		}
		for(String a:words)
		{
			if(a!="remove")
			{	
//				Arrays.toString(words);
				result=result+words+" ";
			}
		}
		System.out.println("After removing the duplicates" + result);

}}
