package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("iphone 12 pro max");
		Thread.sleep(2000);
		driver.findElement(By.className("search-box__button--1oH7")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div[11]/div[2]/div/div/label[2]/span[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[1]/div[3]/div[1]/div/div/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[2]/div/div[1]/div[14]/div/button[1]")).click();
		
		WebElement iframe = driver.findElement(By.className("login-iframe"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("01743690987");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[2]/div[1]/button")).click();
	}

}
