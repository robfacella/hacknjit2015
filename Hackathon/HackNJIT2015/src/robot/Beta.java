package robot;

import java.util.Random;
import java.awt.AWTException;
import java.io.*;

public class Beta extends Alpha
{
private static double delayConstant; //user delay between tasks, avg user actions per second
private static Random Hel;	
	public Beta() throws AWTException 
	{
		super();
		// To DO
		//Move Mouse non linear
		//human paced typing 3or4 strokes per second typing
		// key seek and hold times
		//type from file
		delayConstant = 1.0;//arbitrary val
		Hel = new Random();
	}
	public Beta(double userActionsPerSecond) throws AWTException 
	{
		super();
		// To DO
		//Move Mouse non linear
		//human paced typing 3or4 strokes per second typing
		// key seek and hold times
		//type from file
		delayConstant = userActionsPerSecond;//arbitrary val
		Hel = new Random();
	}
	public void pause()
	{
		double p = delayConstant * (double)Hel.nextInt(13);
		delay((int) p*6);
	}
	public void leftMouseDrag()
	{
		
	}
	public void rightMouseDrag()
	{
		
	}
	
	public void typeFromFile() throws IOException
	{
		
		FileReader file = new FileReader(new File("C:/Users/Rob/Desktop/Program Dev/Hackathon/HackNJIT2015/src/robot/text.txt"));
		BufferedReader text = new BufferedReader(file);
		String send;
		while ((send = text.readLine()) != null)
		{
			keystring(send);
			enter();
		}
	}
	public void keystroke(char key)
	{
		int ASCII = (int) key;
		pause();
		if((ASCII > 96) && (ASCII < 123))
		{
			ASCII -=32;
			keyPress(ASCII);
			 
			keyRelease(ASCII);
		}
		else if((ASCII > 64) && (ASCII < 91))
		{
			keyPress(16);
			keyPress(ASCII);
			 
			keyRelease(ASCII);
			delay(1);
			keyRelease(16);
		}
		
		else if ((ASCII > 47) && (ASCII < 58))
		{
			keyPress(ASCII);
			
			keyRelease(ASCII);
			
		}
		else if ((ASCII > 32) && (ASCII < 42))
		{
			
			if (ASCII == 33)
			{
				keyPress(16);
				keyPress(49);
				 
				keyRelease(49);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 34)
			{
				keyPress(16);
				keyPress(222);
				 
				keyRelease(222);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 35)
			{
				keyPress(16);
				keyPress(51);
				 
				keyRelease(51);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 36)
			{
				keyPress(16);
				keyPress(52);
				 
				keyRelease(52);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 37)
			{
				keyPress(16);
				keyPress(53);
				 
				keyRelease(53);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 38)
			{
				keyPress(16);
				keyPress(55);
				 
				keyRelease(55);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 39)
			{
				
				keyPress(222);
				 
				keyRelease(222);
				
			}
			else if (ASCII == 40)
			{
				keyPress(16);
				keyPress(32);
				 
				keyRelease(32);
				delay(1);
				keyRelease(16);
			}
			else
			{
				keyPress(16);
				keyPress(48);
				 
				keyRelease(48);
				delay(1);
				keyRelease(16);
			}	
		}
		else if ((ASCII > 57) && (ASCII < 65))
		{
			if (ASCII == 64) 
			{
				keyPress(16);
				keyPress(50);
				 
				keyRelease(50);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 63)
			{
				keyPress(16);
				keyPress(47);
				 
				keyRelease(47);
				delay(1);
				keyRelease(16);
				
			}
			else if (ASCII == 58)
			{
				keyPress(16);
				keyPress(59);
				 
				keyRelease(59);
				delay(1);
				keyRelease(16);	
			}
			else if ((ASCII == 60) || (ASCII == 62))
			{
				keyPress(16);
				keyPress(ASCII - 16);
				 
				keyRelease(ASCII - 16);
				delay(1);
				keyRelease(16);
			}
			else
			{
				keyPress(16);
				keyPress(ASCII);
				 
				keyRelease(ASCII);
			}
		}
		else if ((ASCII == 94) || (ASCII == 95) || (ASCII == 96))
		{
			if (ASCII == 94)
			{
				keyPress(16);
				keyPress(54);
				 
				keyRelease(54);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 95)
			{
				keyPress(16);
				keyPress(45);
				 
				keyRelease(45);
				delay(1);
				keyRelease(16);
			}
			else //`
			{
				//???? this and tilde idfk
			}
		}
		else if (ASCII == 42) // * just something about that number
		{
			keyPress(16);
			keyPress(56);
			 
			keyRelease(56);
			delay(1);
			keyRelease(16);
		}
		else if ((ASCII>122) && (ASCII <126))
		{
			keyPress(16);
			keyPress(ASCII-32);
			keyRelease(ASCII-32);
			delay(1);
			keyRelease(16);
		}
		else 
		{
			keyPress(ASCII);
			keyRelease(ASCII);
		}
		
	}
}
