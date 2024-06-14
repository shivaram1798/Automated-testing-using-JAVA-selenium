package TestsRTU2024.UnitTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\softwares\\chromedriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.com/");
		
		Thread.sleep(2000);
		
		///html/body/div[1]/div/div[1]/div[3]/div[2]/div/div/header/div[1]/div/div[1]/div/button/svg
		
		WebElement menu = driver.findElement(By.xpath("//*[@class='icon icon-hamburger']"));
		menu.click();
		
		Thread.sleep(2000);
		//driver.get("https://petstore.com/account/login?return_url=%2Faccount");
		
		
		//html/body/div[1]/div/div[1]/div[1]/div/div[2]/ul[1]/li[7]/div/div/a
		
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/ul[1]/li[7]/div/div/a"));
		login.click();
		
		WebElement register = driver.findElement(By.xpath("//*[@id=\"customer_register_link\"]"));
		register.click();
		
		//driver.get("https://petstore.com/account/register");
		//*[@id="NavDrawer"]/div/div[2]/ul[1]/li[7]/div/div/a
		
		
		
		WebElement first_name = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		first_name.isEnabled();
		first_name.isDisplayed();
		first_name.sendKeys("Shivaram");
		
		
		WebElement last_name = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		last_name.isEnabled();
		last_name.isDisplayed();
		last_name.sendKeys("kukkunoori");
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		email.isEnabled();
		email.isDisplayed();
		email.sendKeys("Shiva.tam@gmail.com");
		
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"CreatePassword\"]"));
		password.isEnabled();
		password.isDisplayed();
		password.sendKeys("Shiva1798");
		
		Thread.sleep(2000);
		
		
		WebElement create = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/div/form/p/input"));
		create.click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://petstore.com/account/register"))
		{
			System.out.println("Registration failed");
			WebElement error = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/div/form/div/ul/li"));
			System.out.println("The actual error message is :"+ error.getText());
			String ecpectedError = "m";
			
		}
		
		
		
		
		//WebElement account = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div/header/div[1]/div/div[3]/div/div/a[1]/svg"));
		//account.click();
		//driver.get("https://petstore.com/account");
		
		
		
		//Thread.sleep(3000);
		//
		
//		WebElement accountElement = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[2]/p[1]")); // Replace with element containing user details
//
//	        if (accountElement.isDisplayed()) {
//	            String fullName = accountElement.getText();
//	            if (fullName.contains("SHIVARAM KUKKUNOORI")) {
//	                System.out.println("Registration Successful!");
//	            } else {
//	                System.out.println("Registration is not successful. Name mismatch!");
//	            }
//	        } else {
//	            System.out.println("Registration failed! Account details not found.");
//	        }
		

	}

}
