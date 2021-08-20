package Week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//Enter from
				driver.findElement(By.id("src")).sendKeys("Chennai");
		
		//Enter Destination
				driver.findElement(By.id("dest")).sendKeys("Bengalure");
	
	    //Enter Date
				driver.findElement(By.id("onward_cal")).
				sendKeys("24-Sep-2021");
	}

}
