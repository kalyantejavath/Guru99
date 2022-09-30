package Logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver;
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalya\\eclipse-workspace\\Guru99Tutorial\\drivers\\geckodriver.exe");
	      driver = new FirefoxDriver();
	      Thread.sleep(3000);
	      driver.get("https://www.demo.guru99.com/V4/");
	      driver.findElement(By.xpath("//*[@type='text']")).sendKeys("mngr443129");
	      driver.findElement(By.xpath("//*[@type='password']")).sendKeys("EbErAru");
	      driver.findElement(By.xpath("//*[@type='submit']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[text()='Log out']")).click();
	      driver.close() ;   

	}

}