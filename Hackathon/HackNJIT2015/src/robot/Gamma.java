package robot;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Gamma extends Beta
{

	public Gamma() throws AWTException 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Gamma(double userActionsPerSecond) throws AWTException 
	{
		super(userActionsPerSecond);

	}
	
	public void typeFromFile(String x) throws IOException
	{
		
		FileReader file = new FileReader(new File(x));
		BufferedReader text = new BufferedReader(file);
		String send;
		while ((send = text.readLine()) != null)
		{
			keystring(send);
			enter();
		}
	}
	public void typeFromFileMC(String x) throws IOException
	{
		FileReader file = new FileReader(new File(x));
		BufferedReader text = new BufferedReader(file);
		String send;
		while ((send = text.readLine()) != null)
		{
			keystroke('t');
			delay(30);
			keystring(send);
			enter();
			delay(500);
		}
	}
	
}
