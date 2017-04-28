package robot;

import java.awt.AWTException;
import java.io.DataInputStream;
import java.io.IOException;

public class Demo {

	public static void MC(String file) throws AWTException, IOException
	{
		Gamma n = new Gamma(1.1);
		n.delay(10000);
		n.typeFromFileMC(file);
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, IOException 
	{
		// TODO Auto-generated method stub
		Gamma n = new Gamma(.9);
		String demo = ("C:/Users/Rob/Desktop/Program Dev/Hackathon/HackNJIT2015/src/robot/text.txt");
		String dance =("C:/Users/Rob/Desktop/Program Dev/Hackathon/HackNJIT2015/src/robot/dance.txt");
		String gwen = ("C:/Users/Rob/Desktop/Program Dev/Hackathon/HackNJIT2015/src/robot/gwen.txt");
		String poke = ("C:/Users/Rob/Desktop/Program Dev/Hackathon/HackNJIT2015/src/robot/pokemontheme.txt.txt");//ffs
		String rR = ("C:/Users/Rob/Desktop/Program Dev/Hackathon/HackNJIT2015/src/robot/rickAstley.txt");
		String queen = ("C:/Users/Rob/Desktop/Program Dev/Hackathon/HackNJIT2015/src/robot/Queen Bo.txt");
		
		String input = "o";
		DataInputStream reader = new DataInputStream(System.in);
		
		System.out.println("Really Terrible User Interface:  (enter the number)");
		System.out.println("1) demo");
		System.out.println("2) Rick Roll");
		System.out.println("3) Pokemon");
		System.out.println("4) close");
		
		while (input.equals("4") == false)
		{			
			input = reader.readLine();
			if(input.equals("1"))
			{

				n.delay(10000);
				n.typeFromFile(demo);
				input = "4";
			}
			else if(input.equals("2"))
			{

				n.delay(10000);
				n.typeFromFile(rR);
				input = "4";
			}
			if(input.equals("3"))
			{

				n.delay(10000);
				n.typeFromFile(poke);
				input = "4";
			}
			else if(input.equals("4"))
			{
				
			}
			if(input.equals("5"))
			{

				n.delay(10000);
				n.typeFromFile(queen);
				input = "4";
			}
			else if(input.equals("8001"))
			{
				input = "4";
				n.delay(10000);
				n.typeFromFile(dance);
			}
			else if(input.equals("69"))
			{
				input = "4";
				n.delay(10000);
				n.typeFromFile(gwen);
			}
		}
		
		MC(rR);
	}

}
