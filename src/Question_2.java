import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author Tim
 *
 *OUTPUT
 
 
 	Exter A string:
	"Sirrah! Deliver deified desserts detartrated!" stressed deified, reviled Harris.
	the string *"Sirrah! Deliver deified desserts detartrated!" stressed deified, reviled Harris.* is a palindrome
 *
 *
	 Exter A string:
	Hopefully this wont be a palindrome and ' you can tell that !!!!!!!! my program @#$)* will work because it wi ll check    to se e that      this    is    not a  pa l i nd rome !!!:D
	the string *Hopefully this wont be a palindrome and ' you can tell that !!!!!!!! my program @#$)* will work because it wi ll check    to se e that      this    is    not a  pa l i nd rome !!!:D* is NOT a palindrome

 *
 *
 */





public class Question_2 {

	public static void main (String args[]){
		//scanner setup for input
		Scanner IN = new Scanner(System.in); 
		
		//create stack
		Stack<Character> Palindrome = new Stack<Character>(); 
		String stackOut=""; 
		
		//insert string
		System.out.println("Exter A string:");
		String input = IN.nextLine(); 
		String temp = input; 
		
		
		//remove spaces and puncuation since they dont matter
		input = input.replaceAll("\\s", "").replaceAll("\\W","").toLowerCase();

		//put the input into the stack
		for(int i=0; i<input.length();i++)
		{
			Palindrome.push(input.charAt(i)); 
		}
		
		//pop off the stack so that the input is reversed
		while(!Palindrome.empty())
		{
			stackOut += Palindrome.pop(); 
			
		}
		
		//compare with the input
		if(stackOut.equals(input))
		{
			System.out.println("the string *"+temp+"* is a palindrome");
		}
		else
		{
			System.out.println("the string *"+temp+"* is NOT a palindrome");

		}
		
		
		
		
		
		
		
	}
	
}
