package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.InputEvent; //needed for keymask, but if value is explicitly called it's redundant
import java.awt.event.KeyEvent;

public class Alpha extends Robot
{
	private static double xCoor;
	private static double yCoor;
	
	public Alpha() throws AWTException 
	{
		super();
		// Point, click, keypress/release
		
		
	}
/////////////////////////////////////////////////////////////////////////////////////////////////
//////Mouse Stuff////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
	public void mouseCoordinates()
	{
		Point pointer = (MouseInfo.getPointerInfo()).getLocation();
		xCoor = pointer.getX();
		yCoor = pointer.getY();
	}
	
	public double getXCoor()
	{
		return xCoor;
	}
	public double getYCoor()
	{
		return yCoor;
	}
	
	public void printCoords()
	{
		//my laptop is 0 to 1365 x; 0 to 767 y
		///for.... reasons?
		mouseCoordinates();
		System.out.println("X: "+ getXCoor() +"; Y: " + getYCoor());
	}
	
	public void leftClick()
	{
		mousePress(1024); //InputEvent.BUTTON1_DOWN_MASK
		delay(1);
		mouseRelease(1024);
		
	}
	
	public void rightClick()
	{
		mousePress(4096); //InputEvent.BUTTON2_DOWN_MASK
		delay(1);
		mouseRelease(4096);
		
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////////////////////////////////////////////////////////
////KeyBoard Stuff//////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
	
	//VK_ keys share ASCII Value of capital letter
	//keyPress(KeyEvent.VK_K); VK_K = 75
	
	/*ASCII: 
	 * A=65
	 * Z=90
	 * 
	 * a=97
	 * z=122
	 * 
	 * 0 @ 48
	 * 9 @ 57
	 * 
	 * everything else will need to be accounted for
	 * 
	
	*/

	public void keystroke(char key)// variable hold time?
	{
		int ASCII = (int) key;
		
		//lower > upper > number > symbol
		
		//lower
		if((ASCII > 96) && (ASCII < 123))
		{
			ASCII -=32;//drop to capital ASCII values for key
			keyPress(ASCII);
			 
			keyRelease(ASCII);
		}
		//capital
		else if((ASCII > 64) && (ASCII < 91))
		{
			keyPress(16);//shift KeyEvent.VK_SHIFT
			keyPress(ASCII);
			 
			keyRelease(ASCII);
			delay(1);
			keyRelease(16);
		}
		
		else if ((ASCII > 47) && (ASCII < 58))//numbers
		{
			keyPress(ASCII);
			
			keyRelease(ASCII);
			
		}
		/*some symbols work as is others do not
		 * working:  . , ; / - = [ ] \
		 * not:  everything else
		 * acent (lower tilde) returns 0?
		 */
		else if ((ASCII > 32) && (ASCII < 42))//symbols and etc
		{
			
			if (ASCII == 33) //!
			{
				keyPress(16);
				keyPress(49);
				 
				keyRelease(49);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 34) //"
			{
				keyPress(16);
				keyPress(222);
				 
				keyRelease(222);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 35) //#
			{
				keyPress(16);
				keyPress(51);
				 
				keyRelease(51);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 36) //$
			{
				keyPress(16);
				keyPress(52);
				 
				keyRelease(52);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 37) //%
			{
				keyPress(16);
				keyPress(53);
				 
				keyRelease(53);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 38) //&
			{
				keyPress(16);
				keyPress(55);
				 
				keyRelease(55);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 39) //'
			{
				
				keyPress(222);
				 
				keyRelease(222);
				
			}
			else if (ASCII == 40)//(
			{
				keyPress(16);
				keyPress(32);
				 
				keyRelease(32);
				delay(1);
				keyRelease(16);
			}
			else //)
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
			if (ASCII == 64) //@
			{
				keyPress(16);
				keyPress(50);
				 
				keyRelease(50);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 63) //?
			{
				keyPress(16);
				keyPress(47);
				 
				keyRelease(47);
				delay(1);
				keyRelease(16);
				
			}
			else if (ASCII == 58) //:
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
			if (ASCII == 94)//^
			{
				keyPress(16);
				keyPress(54);
				 
				keyRelease(54);
				delay(1);
				keyRelease(16);
			}
			else if (ASCII == 95) //_
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
		else //working symbols
		{
			keyPress(ASCII);
			keyRelease(ASCII);
		}
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////
	public void keystring(String word)
	{
		for (int x = 0; x < word.length(); x++)
		{
			keystroke(word.charAt(x));
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////
////SPECIAL KEYS////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Enter
 * Backspace
 * Delete
 * Escape
 * ARROWS
 * TAB
 * CAPS LOCK
 * CTRL
 * FN
 * PG Up/Down
 * Home
 * End
 * Print Screen
 */
	public void enter()
	{
		keyPress(10);
		keyRelease(10);
	}
}
