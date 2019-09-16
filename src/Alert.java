import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println("Title of web page is :"+title);
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(5000);
		
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println("Alert message is: "+alertmsg);
		
		driver.switchTo().alert().accept();
		
		boolean flag=driver.findElement(By.xpath("//input[@name='proceed']")).isDisplayed();
		System.out.println("Go button is displayed: "+flag);		
		


		

	}

}
