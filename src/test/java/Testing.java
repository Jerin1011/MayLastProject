import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		
		d.get("https://login.yahoo.com/");
		WebElement username = d.findElement(By.xpath("//input[@autocapitalize='none']"));
		username.click();
		username.sendKeys("Jerin@yahoo.com");
		d.close();
	
	
	}
}
