package ar.TpDisenio2019.Utilitario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterModificado extends KeyAdapter
{
	public void keyPressed(KeyEvent arg0)
	{
		Robot robot = null;
			
		try
		{
			robot = new Robot();
		} 

		catch(AWTException e)
		{
			e.printStackTrace();
		}
			
		if(arg0.getKeyChar() == '\n')
			robot.keyPress(KeyEvent.VK_TAB);
	}
}
	
	
