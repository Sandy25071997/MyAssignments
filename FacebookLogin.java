package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://en-gb.facebook.com/");
		// Maximize window
		driver.manage().window().maximize();
		// Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		// Enter First name
		driver.findElement(By.name("firstname")).sendKeys("Santhosh");
		// Enter Surname
		driver.findElement(By.name("lastname")).sendKeys("Mohan");
		// Enter mobile number
		WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
		mobileNumber.sendKeys("8428652260");
		// Enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Bluelock@123");
		// Enter DOB
		WebElement dropDown1 = driver.findElement(By.id("day"));
		Select D1 = new Select(dropDown1);
		D1.selectByValue("25");
		WebElement dropDown2 = driver.findElement(By.id("month"));
		Select D2 = new Select(dropDown2);
		D2.selectByValue("7");
		WebElement dropDown3 = driver.findElement(By.id("year"));
		Select D3 = new Select(dropDown3);
		D3.selectByValue("1997");
		// Select the radio button in Gender
		driver.findElement(By.xpath("//input[@value='2']")).click();

	}

}
