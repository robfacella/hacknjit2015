//needed is somewhere
package RNG;

import java.util.Random;

public class RNG 
{
	private static int arg;
	private static boolean neg;
	private static Random gen;
	
	public RNG ()
	{
		gen = new Random();
		
	}
	public RNG (int range, boolean negative)
	{
		gen = new Random();
		arg = range;
		
		neg = negative; // include or exclude negative numbers
	}
	
	public static boolean flip()
	{
		boolean coin = gen.nextBoolean();
		return (coin);
	}
	public static int roll()
	{
		int val;
		
		if (neg == false)//not inclusive of negatives
			val = gen.nextInt(arg);
		
		else // 1:1 chance neg
		{
			val = gen.nextInt(arg);
			if (flip() == true)
				val = val * -1;		
		}
		
		return val;
	}
	public static void test()
	{
		System.out.println(gen.nextInt(2));
	}
}
