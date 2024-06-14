package stepDif;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import org.htmlunit.javascript.host.file.File;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.en.*;
//import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import junit.framework.Assert;
//import com.google.common.io.Files;
//import org.openqa.selenium.TakesScreenshot;
//import com.aventstack.extentreports.ExtentReports;

//import io.github.bonigracia.wdm.WebDriverManager;
//import junit.framework.Assert;



@SuppressWarnings("deprecation")
public class steps {
	
	//ExtentReports extent = ExtentReports.create("extent-reports.html", true);
	//extent.config().screenCaptureAs("path/to/screenshots"); // Replace with your screenshot path

	
	
	
	public WebDriver driver;
	@Given("open browser")
	public void open_browser() throws InterruptedException {
		//ExtentReports extent = ExtentReports.create("extent-reports.html", true);  // Replace with your desired filename
		//extent.config().screenCaptureAs("path/to/screenshots"); // Replace with your screenshot path

		 System.out.println("Hello browser");
		    System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://www.petstore.com/");
		    driver.manage().window().maximize();
		    //java.io.File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   //Files.copy(f, new File("C:\\Users\\shiva\\eclipse-workspace\\UnitTestProject\\out\\Screenshots\\homepage.jpg"));
		    Thread.sleep(2000);
	}
	@When("User enter first_name, Last_name, Email and password")
	public void user_enter_first_name_last_name_email_and_password() throws InterruptedException, IOException {
		WebElement menu = driver.findElement(By.xpath("//*[@class='icon icon-hamburger']"));
		menu.click();
		
		Thread.sleep(2000);
		//driver.get("https://petstore.com/account/login?return_url=%2Faccount");
		
		
		//html/body/div[1]/div/div[1]/div[1]/div/div[2]/ul[1]/li[7]/div/div/a
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/ul[1]/li[7]/div/div/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"customer_register_link\"]")).click();
		Thread.sleep(2000);
		
		//driver.get("https://petstore.com/account/register");
		//*[@id="NavDrawer"]/div/div[2]/ul[1]/li[7]/div/div/a
		
		
		
		WebElement first_name = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		first_name.isEnabled();
		first_name.isDisplayed();
		first_name.sendKeys("navya");
		
		
		WebElement last_name = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		last_name.isEnabled();
		last_name.isDisplayed();
		last_name.sendKeys("tanguturi");
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		email.isEnabled();
		email.isDisplayed();
		email.sendKeys("navyasri@gmail.com");
		
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"CreatePassword\"]"));
		password.isEnabled();
		password.isDisplayed();
		password.sendKeys("Shiva1798");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/div/form/p/input")).click();
		while (System.in.read() == -1) {
            // do nothing, waiting for input
        }
		
		Thread.sleep(3000);
		
		driver.get("https://petstore.com/account");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div/header/a")).click();
	    Thread.sleep(2000);
	    driver.close();
	}

	
	@Then("User is navigated to homepage and logged in")
	public void user_is_navigated_to_homepage_and_logged_in() {
	    System.out.println("done");
	    driver.get("https://petstore.com/account");
		WebElement accountElement = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[2]/p[1]")); // Replace with element containing user details

	        if (accountElement.isDisplayed()) {
	            String fullName = accountElement.getText();
	            String expected_name = "SWETHA MADHU";
	            
	            Assert.assertEquals(expected_name,fullName);
	    
	            
	         
//	            if (fullName.contains("SWETHA MADHU")) {
//	                System.out.println("Registration Successful!");
//	            } else {
//	                System.out.println("Registration is not successful. Name mismatch!");
//	            }
//	        } else {
//	            System.out.println("Registration failed! Account details not found.");
//	        }
	    
	}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("registration page")
	public void registration_page() throws InterruptedException {
		
		System.out.println("regestration page");
	    System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://petstore.com/account/register");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    
	}

	@When("User enters already regestered mail")
	public void user_enters_already_regestered_mail() throws InterruptedException, IOException {
		WebElement first_name = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		first_name.isEnabled();
		first_name.isDisplayed();
		first_name.sendKeys("Swetha");
		
		
		WebElement last_name = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		last_name.isEnabled();
		last_name.isDisplayed();
		last_name.sendKeys("madhu");
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		email.isEnabled();
		email.isDisplayed();
		email.sendKeys("Swetha.dm@gmail.com");
		
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"CreatePassword\"]"));
		password.isEnabled();
		password.isDisplayed();
		password.sendKeys("Shiva1798");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/div/form/p/input")).click();
		
		while (System.in.read() == -1) {
            // do nothing, waiting for input
        }
		
		
		
	}

	@Then("User is notifies with error message")
	public void user_is_notifies_with_error_message() {
		String error_message = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/div/form/div/ul/li")).getText();
		
		String expected_error_message = "This email address is already associated with an account. If this account is yours, you can reset your password";
		Assert.assertEquals(expected_error_message, error_message);
		System.out.println("quit");
		driver.close();
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	@Given("customer home page")
	public void customer_home_page() throws InterruptedException {
		System.out.println("login page");
	    System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://petstore.com/account/login?return_url=%2Faccount");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		
		
	}
	
	@Given("login into user account")
	public void login_into_user_account() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]")).sendKeys("shiva.ram1798@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]")).sendKeys("Shiva1798");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"customer_login\"]/p[1]/button")).click();
	    Thread.sleep(50000);
	    
	}

	@When("user chooses sort by price low to high")
	public void user_chooses_sort_by_price_low_to_high() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='icon icon-hamburger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Label-collections-dog1\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SortBy\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SortBy\"]/option[6]")).click();
		Thread.sleep(4000);
		
		
		
		
	}

	@Then("products must be sorted in low to high price")
	public void products_must_be_sorted_in_low_to_high_price() throws InterruptedException {
		List<WebElement> priceElements = driver.findElements(By.xpath("//*[@id=\"CollectionSection\"]/div[2]/div[1]/div/a/div[2]/div[3]")); 
	    // Extract price values and convert them to numbers
	    List<Double> prices = new ArrayList<>();
	    for (WebElement element : priceElements) {
	        String priceText = element.getText().replace("$", "");
	        prices.add(Double.parseDouble(priceText));
	    }

	    // Verify if prices are in ascending order
	    boolean isAscending = true;
	    for (int i = 0; i < prices.size() - 1; i++) {
	        if (prices.get(i) > prices.get(i + 1)) {
	            isAscending = false;
	            break;
	        }
	    }

	    if (isAscending) {
	        System.out.println("Products are sorted by price in ascending order (PASS)");
	    } else {
	        System.out.println("Products are NOT sorted by price in ascending order (FAIL)");
	    }
	    
	    driver.get("https://petstore.com/account");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div/header/a")).click();
	    Thread.sleep(2000);
	    driver.close();
	}
////////////////////////////////////////////////////////////////////////////////////////////////
	int counter = 0;
	@Given("customer login page")
	public void customer_login_page() throws InterruptedException {
		System.out.println("login page");
	    System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://petstore.com/account/login?return_url=%2Faccount");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("user login")
	public void user_login() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]")).sendKeys("shiva.ram1798@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]")).sendKeys("Shiva1798");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"customer_login\"]/p[1]/button")).click();
	    while (System.in.read() == -1) {
            // do nothing, waiting for input
        }
	}

	@When("search products with some text")
	public void search_products_with_some_text() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div[3]/div[2]/div/div/header/div[1]/div/div[3]/div/div/a[2]")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.xpath("//*[@id=\"HeaderSearchForm\"]/input[2]")).sendKeys("cat");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"HeaderSearchForm\"]/button")).click();
	    
	  
	    
	}

	@Then("User will be displayed with all rlevant products with types text")
	public void user_will_be_displayed_with_all_rlevant_products_with_types_text() throws InterruptedException {
		 List<WebElement> productElements = driver.findElements(By.xpath("//*[@id=\"MainContent\"]/div/div/div/div[1]/div[2]/div[1]/div/a/div[2]/div[1]")); 
		
	        boolean allProductsContainText = true;
	        for (WebElement productElement : productElements) {
	            String productName = productElement.getText(); // Assuming product name is within an h3 tag
	            //String productDescription = productElement.findElement(By.className("description")).getText(); // Assuming description class

	            String searchText="cat";
				if (!productName.toLowerCase().contains(searchText.toLowerCase()) ) {
	                allProductsContainText = false;
	                break;
	            }
	        }

	        if (allProductsContainText) {
	            System.out.println("Products displayed contain search text (PASS)");
	        } else {
	            System.out.println("Products displayed do NOT contain search text (FAIL)");
	        }
	        driver.get("https://petstore.com/account");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div/header/a")).click();
		    Thread.sleep(2000);
		    driver.close();
	        
	    }
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	String product_names_expected;
	double expected_price;
	@Given("login to account")
	public void login_to_account() throws InterruptedException, IOException {
		System.out.println("login page");
	    System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://petstore.com/account/login?return_url=%2Faccount");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]")).sendKeys("shiva.ram1798@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]")).sendKeys("Shiva1798");
	    //Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"customer_login\"]/p[1]/button")).click();
	    while (System.in.read() == -1) {
            // do nothing, waiting for input
        }
	    //Thread.sleep(50000);
	}

	@When("add items tocart")
	public void add_items_tocart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='icon icon-hamburger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Label-collections-dog1\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SortBy\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SortBy\"]/option[9]")).click();
		Thread.sleep(4000);
		
		List<WebElement> products = driver.findElements(By.xpath("//a[contains(@class,'grid-product__link')]"));
//		for (WebElement product : products) {
//			Thread.sleep(4000);
//			product.click(); 
//			Thread.sleep(2000);
//            driver.navigate().back();
//            System.out.println(counter);
//            counter = counter+1;
//            
//            if(counter == 5)
//            	break;
//            }
//	}
		for (int i = 0; i < products.size() && i < 7; i++) {
			  WebElement product = products.get(i); // Get element by index within the loop
			  Thread.sleep(4000);
			  product.click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@class=\"btn btn--full add-to-cart\"]")).click();
			  Thread.sleep(2000);
//			  driver.findElement(By.xpath("//*[@id=\"CartDrawer\"]/form/div[1]/div/div[2]/button/svg")).click();
//			  
			  product_names_expected = product_names_expected+driver.findElement(By.xpath("//*[@class=\"h2 product-single__title\"]")).getText();
			  List<WebElement> priceElements = driver.findElements(By.xpath(".//span[contains(@class,'product__price') or contains(@class,'product__price on-sale')]"));
			  Thread.sleep(2000);
			  System.out.println(priceElements.size());
			 
				  if(priceElements.size()>2) {
					  System.out.println("inside if block");
				    String priceText = priceElements.get(2).getText().replace("$", "").replace(",", "");
				    System.out.println("Extracted price: " + priceText);
				    expected_price = expected_price+(Double.parseDouble(priceText));
				  
				    
				}
				  else {
					  String priceText = priceElements.get(0).getText().replace("$", "").replace(",", "");
					    System.out.println("Extracted price: " + priceText);
					    expected_price = expected_price+(Double.parseDouble(priceText)); 
					  
				  }
			  //String priceText = driver.findElement(By.xpath("(.//div[contains(@class,'product__price') or contains(@class,'product__price on-sale')])")).getText().replace("$", "");
		        
		        driver.navigate().back();

			  // Refresh the product list after navigating back (optional)
			  products = driver.findElements(By.xpath("//a[contains(@class,'grid-product__link')]")); 

			  System.out.println(counter);
			  counter=counter+1;
		}}

	@Then("the cart item count should be updated to plus one")
	public void the_cart_item_count_should_be_updated_to_plus_one() {
//		System.out.println(counter);
//		System.out.println(expected_price);
		driver.findElement(By.xpath("//*[@class=\"site-nav__link site-nav__link--icon js-drawer-open-cart js-no-transition\"]")).click();
		Assert.assertEquals(counter, driver.findElements(By.xpath("//*[@class=\"ajaxcart__row\"]")).size());
		if(driver.findElements(By.xpath("//*[@class=\"ajaxcart__row\"]")).size()==counter)
		{
			System.out.println("correct number of products added");
		}
		
        }
		
		
	

	@Then("the cart total price should be equal to the previous price plus item price")
	public void the_cart_total_price_should_be_equal_to_the_previous_price_plus_item_price() throws InterruptedException {
		//System.out.println(counter);
		 Thread.sleep(2000);
		//System.out.println(driver.findElements(By.xpath("//*[@class=\"ajaxcart__price\"]")).getText());
		Assert.assertEquals(expected_price, Double.parseDouble(driver.findElements(By.xpath("//*[@class=\"ajaxcart__price\"]")).get(7).getText().replace("$", "").replace(",", "")));
		if(Double.parseDouble(driver.findElements(By.xpath("//*[@class=\"ajaxcart__price\"]")).get(7).getText().replace("$", "").replace(",", ""))==expected_price)
		{
			System.out.println("correct price");
		}
	
        }
	
	

	@Then("the cart should display the added item titlee")
	public void the_cart_should_display_the_added_item_titlee() throws InterruptedException {
		driver.get("https://petstore.com/account");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div/header/a")).click();
	    Thread.sleep(2000);
	    driver.close();
		
		
	}

	
	
	
	}



