package Practices;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class SikuliExecution {
	
	public static void main(String[] args) throws Throwable {
		
		Screen scr=new Screen();
		
		Pattern pattern = new Pattern("‪‪C:\\Users\\Hp\\Pictures\\MiniBar.png");
	
		scr.click(pattern);
		
		Pattern pattern1=new Pattern("‪‪C:\\Users\\Hp\\Pictures\\Search.png");
		scr.click(pattern1);
		scr.type("Paint");
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern pat=new Pattern("‪‪C:\\Users\\Hp\\Pictures\\WriteMode.png");
		scr.click(pat);
		
		Pattern patt=new Pattern("‪‪C:\\Users\\Hp\\Pictures\\PaintMode.png");
		scr.click();
		scr.type("Shwetha");
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
