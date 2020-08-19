package codility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap {

	public static void main(String[] args)
	{
		System.out.println(solution(257));
	}
	
	public static int solution(int N)
	{
		String s = Integer.toBinaryString(N);
	

		int highest = 0;
		boolean start = false;
		int cntr = 0;
		
		for(int i=0; i<s.length();i++)
		{
			if(!start && s.charAt(i)=='1')
			{
				start = true;
			}
			else if(start && s.charAt(i)=='0')
			{
				cntr++;
			}
			else if(start && s.charAt(i) == '1')
			{
				start = false;
				
				if(cntr > highest)
				{
					highest = cntr;
				}
				
				cntr =0;
				
				i=i-1;
			}
		}
		
		return highest;
		
	}
}
