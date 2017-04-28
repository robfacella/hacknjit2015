package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class debug {

	public static void main(String[] args) throws AWTException, IOException 
	{
		Robot test = new Robot();
		test.mouseMove(148, 744);
		
		Beta Hel = new Beta();
		
		System.out.println("null test");
		
		
		Hel.delay(5000);
		
		for (int i = 0; i < 1; i++)
		{
			Hel.printCoords();
			Hel.delay(300);
		}
		
		
	}

}
