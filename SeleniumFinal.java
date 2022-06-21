package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SeleniumFinal {
 
	 @Test(priority=1)
	  public void test_logo() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nidhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			String url = "https://www.google.com";
		
			Thread.sleep(2000);
		
		
		driver.get(url);
		driver.manage().window().maximize();
		
		

		driver.findElement(By.name("q")).sendKeys("cocopunch");
		
		 driver.findElement(By.name("btnK")).submit();
		 Thread.sleep(2000);
		

		 //opening the first cocopunch link
		driver.findElement(By.xpath("//h3[contains(text(),'coconut online | Bulk Tender Coconut online in Del')]")).click();
		Thread.sleep(2000);
		//checking if the logo is displayed or not
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[1]/div/div/div/div[1]/div/div/span/a/img"));  
		if (logo.isDisplayed())
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		driver.close();
	 }
	 
	 @Test(priority=2)
	  public void test_about() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nidhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			String url = "https://www.google.com";
		
			Thread.sleep(2000);
		
		
		driver.get(url);
		driver.manage().window().maximize();
		
		

		driver.findElement(By.name("q")).sendKeys("cocopunch");
		
		 driver.findElement(By.name("btnK")).submit();
		 Thread.sleep(2000);
		

		 //opening the first cocopunch link
		driver.findElement(By.xpath("//h3[contains(text(),'coconut online | Bulk Tender Coconut online in Del')]")).click();
		Thread.sleep(2000);
		//checking if the logo is displayed or not
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[1]/div/div/div/div[1]/div/div/span/a/img"));  
		if (logo.isDisplayed())
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		driver.findElement(By.xpath("//*[@id=\"menu-item-344\"]/a")).click();
		Thread.sleep(2000);
		//scrolling the about page
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)");
		Thread.sleep(2000);
		driver.close();

	  }
	 @Test(priority=3)
	  public void test_addtocart() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nidhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			String url = "https://www.google.com";
		
			Thread.sleep(2000);
		
		
		driver.get(url);
		driver.manage().window().maximize();
		
		

		driver.findElement(By.name("q")).sendKeys("cocopunch");
		
		 driver.findElement(By.name("btnK")).submit();
		 Thread.sleep(2000);
		

		 //opening the first cocopunch link
		driver.findElement(By.xpath("//h3[contains(text(),'coconut online | Bulk Tender Coconut online in Del')]")).click();
		Thread.sleep(2000);
		//checking if the logo is displayed or not
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[1]/div/div/div/div[1]/div/div/span/a/img"));  
		if (logo.isDisplayed())
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		driver.findElement(By.xpath("//*[@id=\"menu-item-344\"]/a")).click();
		Thread.sleep(2000);
		//scrolling the about page
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-406\"]/a")).click();
		Thread.sleep(2000);
		//scrolling 
		JavascriptExecutor add = (JavascriptExecutor) driver;
		add.executeScript("window.scrollBy(0,4000)");

		//click on the product
		driver.findElement(By.className("woocommerce-loop-product__title")).click();
		
		//adding to cart
		driver.findElement(By.xpath("//*[@id=\"product-5662\"]/div[2]/form/button")).click();
		Thread.sleep(2000);
		driver.close();
	  }
	 @Test(priority=4)
	  public void test_login() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nidhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//launching google
			WebDriver driver = new ChromeDriver();
			String url = "https://www.google.com";
			Thread.sleep(2000);
			
			
			driver.get(url);
			driver.manage().window().maximize();
			
			

			driver.findElement(By.name("q")).sendKeys("cocopunch");
			
			 driver.findElement(By.name("btnK")).submit();
			 Thread.sleep(2000);
			
		
			 //opening the first cocopunch link
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/a/h3")).click();
			Thread.sleep(2000);
			//checking if the logo is displayed or not
			WebElement logo = driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[1]/div/div/div/div[1]/div/div/span/a/img"));  
			if (logo.isDisplayed())
			{
				System.out.println("logo is present");
			}
			else
			{
				System.out.println("logo is not present");
			}
			//about
			driver.findElement(By.xpath("//*[@id=\"menu-item-344\"]/a")).click();
			Thread.sleep(2000);
			//scrolling the about page

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,4500)");
			Thread.sleep(2000);
			//all products page
			
			driver.findElement(By.xpath("//*[@id=\"menu-item-406\"]/a")).click();
			Thread.sleep(2000);
			//scrolling 
			JavascriptExecutor add = (JavascriptExecutor) driver;
			add.executeScript("window.scrollBy(0,4000)");
			
			
			//click on the product
			driver.findElement(By.className("woocommerce-loop-product__title")).click();
			
			//adding to cart
			driver.findElement(By.xpath("//*[@id=\"product-5662\"]/div[2]/form/button")).click();
			Thread.sleep(2000);
			
			//account
			driver.findElement(By.xpath("//*[@id=\"menu-item-470\"]/a")).click();
			Thread.sleep(2000);
			
			//my account
			driver.findElement(By.xpath("//*[@id=\"menu-item-472\"]/a")).click();
			Thread.sleep(2000);
			//scrolling on account page
			JavascriptExecutor a = (JavascriptExecutor) driver;
			a.executeScript("window.scrollBy(0,300)");
			
			//username
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rtntasn12345@gmail.com");
			//password
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rtntasn12345");
			Thread.sleep(2000);
			//log in
			driver.findElement(By.xpath("//*[@id=\"post-99\"]/div/div/form/p[3]/button")).click();
			driver.close();
	  }
	 
 @Test(priority=5)
  public void test_media() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\nidhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launching google
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
		Thread.sleep(2000);
		
		
		driver.get(url);
		driver.manage().window().maximize();
		
		

		driver.findElement(By.name("q")).sendKeys("cocopunch");
		
		 driver.findElement(By.name("btnK")).submit();
		 Thread.sleep(2000);
		
	
		 //opening the first cocopunch link
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/a/h3")).click();
		Thread.sleep(2000);
		//checking if the logo is displayed or not
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[1]/div/div/div/div[1]/div/div/span/a/img"));  
		if (logo.isDisplayed())
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		//about
		driver.findElement(By.xpath("//*[@id=\"menu-item-344\"]/a")).click();
		Thread.sleep(2000);
		//scrolling the about page

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)");
		Thread.sleep(2000);
		//all products page
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-406\"]/a")).click();
		Thread.sleep(2000);
		//scrolling 
		JavascriptExecutor add = (JavascriptExecutor) driver;
		add.executeScript("window.scrollBy(0,4000)");
		
		
		//click on the product
		driver.findElement(By.className("woocommerce-loop-product__title")).click();
		
		//adding to cart
		driver.findElement(By.xpath("//*[@id=\"product-5662\"]/div[2]/form/button")).click();
		Thread.sleep(2000);
		
		//account
		driver.findElement(By.xpath("//*[@id=\"menu-item-470\"]/a")).click();
		Thread.sleep(2000);
		
		//my account
		driver.findElement(By.xpath("//*[@id=\"menu-item-472\"]/a")).click();
		Thread.sleep(2000);
		//scrolling on account page
		JavascriptExecutor a = (JavascriptExecutor) driver;
		a.executeScript("window.scrollBy(0,300)");
		
		//username
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rtntasn12345@gmail.com");
		//password
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rtntasn12345");
		Thread.sleep(2000);
		//log in
		driver.findElement(By.xpath("//*[@id=\"post-99\"]/div/div/form/p[3]/button")).click();
		

		//facebook 
		driver.findElement(By.xpath("//*[@id=\"icon_wrapper\"]/a[1]/i")).click();
		Thread.sleep(2000);
		driver.close();
		
	 }
}
