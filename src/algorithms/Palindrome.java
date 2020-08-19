package algorithms;

public class Palindrome {
	
	public static boolean isPalindrome(String val)
	{
		String reverse = "";
		
		for(int i=val.length()-1; i>=0; i--)
		{
			reverse = reverse + val.charAt(i);
		}
		
		return val.equalsIgnoreCase(reverse);
		
	}

}
