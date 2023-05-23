import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.SplashScreen;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.JFileChooser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.api.Screen;

public class XmlDev {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://validator.w3.org/");
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the path: ");
//		String path = "D:\Jerin\XML";
		
		Actions a = new Actions(d);
		Thread.sleep(2000);
		d.findElement(By.xpath("(//span[text()='Validate by'])[2]")).click();
		WebElement choose = d.findElement(By.xpath("//label[@title='Choose a Local File to Upload and Validate']"));
//		a.moveToElement(choose);
		choose.click();
		
		Thread.sleep(2000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_C);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_F);
			r.keyRelease(KeyEvent.VK_F);
			r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	}

}
