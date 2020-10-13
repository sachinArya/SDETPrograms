package codility;

public class FrogJump {
	
	public static void main(String args[])
	{
		System.out.println(solution(3, 999111321, 7));
	}
	
	public static int solution(int X, int Y, int D)
	{
		int jump=0;
		
		jump = (int)Math.ceil((double)(Y-X)/(double)D);
		
		return jump;
	}

}
