package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the window
		driver.manage().window().maximize();
		// Enter User name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click the Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		// Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		// Enter Account name
		driver.findElement(By.id("accountName")).sendKeys("Santhosh");
		// Enter the description as "Selenium Automation Tester"
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		// Enter Computer Software as industry
		WebElement dropDown1 = driver.findElement(By.name("industryEnumId"));
		Select dd1 = new Select(dropDown1);
		dd1.selectByVisibleText("Computer Software");
		// Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement dropDown2 = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select(dropDown2);
		dd2.selectByVisibleText("S-Corporation");
		// Select "Employee" as the source using SelectByValue
		WebElement dropDown3 = driver.findElement(By.id("dataSourceId"));
		Select dd3 = new Select(dropDown3);
		dd3.selectByValue("LEAD_EMPLOYEE");
		// Select "eCommerce Site Internal Campaign" as the marketing campaign using
		// SelectByIndex
		WebElement dropDown4 = driver.findElement(By.id("marketingCampaignId"));
		Select dd4 = new Select(dropDown4);
		dd4.selectByIndex(6);
		// Select "Texas" as the state/province using SelectByValue
		WebElement dropDown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd5 = new Select(dropDown5);
		dd5.selectByValue("TX");
		// Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		// Close the browser window
		driver.close();
	}

}
