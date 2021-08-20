package Week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Create new account button click
		driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();
		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys("Rajashri");
		//Enter last name
		driver.findElement(By.name("lastname")).sendKeys("Rajamanickam");
		//Enter mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9840962580");
		//Enter password
		driver.findElement(By.id("password_step_input")).sendKeys("positive");
	    
		//select the month from dropdown
		WebElement mon = driver.findElement(By.id("month"));
		Select month1 = new Select(mon);
		month1.selectByIndex(5);
		
		//select day from dropdown
		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByValue("18");
		
		//select year from dropdown
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("1994");
		
		//Selecting Gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//Clicking signup
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//Verifying URL
		String str = driver.getCurrentUrl();
		String str1 = "https://www.facebook.com/";
		
		if (str.equals(str1))
		{
			System.out.println("Account Created");
		}
			
		else
			{
			System.out.println("Account not created");
			}
		
		
	}
	
}
