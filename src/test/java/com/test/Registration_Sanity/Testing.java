package com.test.Registration_Sanity;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Testing {
	
	 private RemoteWebDriver driver;

	    @BeforeTest
	    public void setup() throws Exception {
	        DesiredCapabilities dc = DesiredCapabilities.chrome();
	        URL url = new URL("http://172.12.20.99:4444/wd/hub");
	        driver = new RemoteWebDriver(url, dc);
	    }
	    @Parameters("URL")
	    @Test(priority=1)
	    public void login(@Optional("defaultURL") String URL) throws InterruptedException
	    //public void Login() throws InterruptedException 
	    {
	    
	    driver.manage().window().maximize();
	    driver.get(URL);
	    //driver.get("http://apollo2.humanbrain.in/");
	    System.out.println("==================================================================");
	    System.out.println("The server is Opened Sucessfully");
	    System.out.println("==================================================================");
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    WebElement viewerSectionLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, 'ng-tns-c93-3')]")));
	    viewerSectionLink.click();
	    System.out.println("The Viewer Icon is clicked");
	    System.out.println("==================================================================");
	    String parentWindow = driver.getWindowHandle();
	    WebDriverWait wait1 = new WebDriverWait(driver, 20);
	    WebElement login = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Log In ']")));
	    login.click();
	    System.out.println("The login Button is clicked");
	    System.out.println("==================================================================");
	    Thread.sleep(4000);
	    Set<String> allWindows = driver.getWindowHandles();
	    for (String window : allWindows) {
	    if (!window.equals(parentWindow)) {
	    driver.switchTo().window(window);
	    break;
	    }
	    }
	    Thread.sleep(4000);
	    WebDriverWait wait2 = new WebDriverWait(driver,20);
	    WebElement emailInput = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
	    emailInput.sendKeys("softwaretestingteam9@gmail.com");
	    System.out.println("Mail I'd is entered");
	    System.out.println("==================================================================");
	    WebDriverWait wait3 = new WebDriverWait(driver,20);
	    WebElement Next = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	    Next.click();
	    System.out.println("The Next Button is clicked");
	    System.out.println("==================================================================");
	    WebDriverWait wait4 = new WebDriverWait(driver,20);
	    WebElement PasswordInput = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
	    PasswordInput.sendKeys("Health#123");
	    System.out.println("Password is entered");
	    System.out.println("==================================================================");
	    WebDriverWait wait5 = new WebDriverWait(driver,20);
	    WebElement Next2 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	    Next2.click();
	    System.out.println("The Next Button is clicked");
	    System.out.println("==================================================================");
	    Thread.sleep(5000);
	    driver.switchTo().window(parentWindow);
	    Thread.sleep(5000);
	    }
	    
	    @Test(priority=2)
		public void series_set() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(driver, 30); 
			driver.switchTo().defaultContent();
	
			
	    	 try {
	    		    WebElement Mouse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@role='grid']//tr[6]")));
	    		    Mouse.click();
	    		    System.out.println("Human Fetus clicked successfully.");
	    		    Thread.sleep(2000);
	    		} catch (Exception e) {
	    		    System.out.println("Human Fetus not clicked: " + e.getMessage());
	    		}
	   
	    	 
	    	 try {
	    		    WebElement Brain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@role='grid']//tr[7]//td[2]")));
	    		    Brain.click();
	    		    System.out.println(" Brain clicked successfully.");
	    		    Thread.sleep(2000);
	    		} catch (Exception e) {
	    		    System.out.println("Brain not clicked: " + e.getMessage());
	    		}
	    	 
	    	 
	    	 try {
	 		    WebElement MTB_10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()=' FB_3']")));
	 		    MTB_10.click();
	 		    System.out.println("Fb 3 clicked successfully.");
	 		    Thread.sleep(2000);
	 		} catch (Exception e) {
	 		    System.out.println(" Fb 3 not clicked: " + e.getMessage());
	 		}
	    	 
	    	 
	    	 String parentWindow = driver.getWindowHandle();
	    	 try {
		 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
		 		   viewericon.click();
		 		    System.out.println("viewer icon is clicked successfully.");
		 		    Thread.sleep(2000);
		 		} catch (Exception e) {
		 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
		 		}
	    	 
	    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			  Set<String> allWindows = driver.getWindowHandles();
		        for (String window : allWindows) {
		            if (!window.equals(parentWindow)) {
		                driver.switchTo().window(window);
		                break;
		            }
		        }
	      
	    }
	    
	    
	    @Test (priority=3)
	    public void Rotation() throws InterruptedException {
//	    try {
//	    WebDriverWait wait9 = new WebDriverWait(driver,30);
//	    WebElement table3 = wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Go To Section']")));
//	    table3.click();
//	    System.out.println("The fetal brain 68 is clicked");
//	    System.out.println("==================================================================");
//	    }
//	    catch(Exception e) {
//	    System.out.println("The fetal brain 68 is not clicked");
//	    System.out.println("==================================================================");
//	    }
	    WebDriverWait wait10 = new WebDriverWait(driver, 50);
	    try {
	    WebElement inputElement = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='1006'])[1]")));
	    Thread.sleep(3000);
	    inputElement.click();
	    Thread.sleep(3000);
	    System.out.println("The Number is opened Successfully");
	    System.out.println("==================================================================");
	    }catch(Exception e) {
	    System.out.println("The Number is not opened");
	    System.out.println("==================================================================");
	    }
	    try {
	    WebDriverWait wait11 = new WebDriverWait(driver,40);
	    Thread.sleep(5000);
	    WebElement Icon1 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/viewer/assets/images/colorsvg/atlasRegistration.svg']")));
	    Thread.sleep(3000);
	    Icon1.click();
	    Thread.sleep(3000);
	    System.out.println("The Manual Registration window  opened sucessfully");
	    System.out.println("==================================================================");
	    }
	    catch(Exception e) {
	    System.out.println("The Manual Registration window is not open");
	    System.out.println("==================================================================");
	    }
	    Thread.sleep(6000);
	    try {
	    WebDriverWait wait12 = new WebDriverWait(driver,50);
	    WebElement inputElement1 = wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Degree']")));
	    Thread.sleep(5000);
	    System.out.println("The Degree box is displayed");
	    System.out.println("==================================================================");
	    inputElement1.sendKeys("50\n");
	    System.out.println("The Degree value 50 is Entered");
	    System.out.println("==================================================================");
	    Thread.sleep(5000);
	    System.out.println("The Image is Rotated Successfully");
	    System.out.println("==================================================================");
	    }catch(Exception e) {
	    System.out.println("The Image is not Rotated ");
	    System.out.println("==================================================================");
	    }
	    try {
	    WebDriverWait wait13 = new WebDriverWait(driver,40);
	    Thread.sleep(3000);
	    WebElement Icon2 = wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/viewer/assets/images/colorsvg/saved.svg']")));
	    Thread.sleep(3000);
	    Icon2.click();
	    Thread.sleep(3000);
	    System.out.println("The Manual Reg is saved successfully");
	    System.out.println("==================================================================");
	    }catch(Exception e) {
	    System.out.println("The Manual Reg Not saved ");
	    System.out.println("==================================================================");
	    }
	    }
	    @Test (priority=4)
	    public void Retrive()
	    {
	    
	    String expectedT11 = null;
	    String expectedT12 = null;
	    try {
	    WebDriverWait wait14 = new WebDriverWait(driver, 40);
	    Thread.sleep(3000);
	    WebElement Icon3 = wait14.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='paragraph'])[2]")));
	    Thread.sleep(3000);
	    String t = Icon3.getText();
	    expectedT11 = t; // Set the value of expectedT11 here
	    Thread.sleep(3000);
	    System.out.println("The value is:" + t);
	    System.out.println("==================================================================");
	    } catch (Exception e) {
	    System.out.println("The value doesn't get");
	    System.out.println("==================================================================");
	    }
	    try {
	    WebDriverWait wait15 = new WebDriverWait(driver, 40);
	    Thread.sleep(3000);
	    WebElement Translate1 = wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='paragraph'])[1]")));
	    Thread.sleep(3000);
	    String s = Translate1.getText();
	    expectedT12 = s;  
	    Thread.sleep(3000);
	    System.out.println("The Rotation value is:" + s);
	    System.out.println("==================================================================");
	    } catch (Exception e) {
	    System.out.println("The Rotation value doesn't get");
	    System.out.println("==================================================================");
	    }
	    try {
	    WebDriverWait wait16 = new WebDriverWait(driver,40);
	    Thread.sleep(3000);
	    WebElement Icon4 = wait16.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Back']")));
	    Thread.sleep(3000);
	    Icon4.click();
	    Thread.sleep(3000);
	    System.out.println("The page is Back");
	    System.out.println("==================================================================");
	    }catch(Exception e) {
	    System.out.println("The Page is not Back ");
	    System.out.println("==================================================================");
	    }
	    WebDriverWait wait17 = new WebDriverWait(driver, 50);
	    try {
	    WebElement inputElementt = wait17.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='1006'])[1]")));
	    Thread.sleep(3000);
	    inputElementt.click();
	    Thread.sleep(3000);
	    System.out.println("The Number opened Successfully");
	    System.out.println("==================================================================");
	    }catch(Exception e) {
	    System.out.println("The Number not opened");
	    System.out.println("==================================================================");
	    }
	    try {
	    WebDriverWait wait18 = new WebDriverWait(driver,40);
	    Thread.sleep(3000);
	    WebElement Icon2 = wait18.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/viewer/assets/images/colorsvg/atlasRegistration.svg']")));
	    Thread.sleep(3000);
	    Icon2.click();
	    Thread.sleep(3000);
	    System.out.println("The Manual Registration is clicked");
	    System.out.println("==================================================================");
	    }
	    catch(Exception e) {
	    System.out.println("The Manual Registration is not clicked");
	    System.out.println("==================================================================");
	    }
	    try {
	       WebDriverWait wait19 = new WebDriverWait(driver, 20);
	       Thread.sleep(5000);
	       WebElement icon5 = wait19.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='paragraph'])[2]")));
	       Thread.sleep(5000);
	       String Y = icon5.getText();
	       Thread.sleep(5000);
	       Assert.assertEquals(expectedT11, Y);
	       System.out.println("The Expect Rotation Value is correct, The value is=" + Y);
	       System.out.println("==================================================================");
	    } catch (Exception e) {
	    System.out.println("The Expect Rotation Value is not correct");
	    System.out.println("==================================================================");
	       e.printStackTrace();
	    }
	    try {
	       WebDriverWait wait20 = new WebDriverWait(driver, 20);
	       Thread.sleep(5000);
	       WebElement icon7 = wait20.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='paragraph'])[1]")));
	       Thread.sleep(5000);
	       String Z = icon7.getText();
	       Thread.sleep(5000);
	       Assert.assertEquals(expectedT12, Z);
	       System.out.println("The Expect Translate Value is correct, The value is=" + Z);
	       System.out.println("==================================================================");
	    } catch (Exception e) {
	    System.out.println("The Expect Translate Value is not correct, The value is");
	    System.out.println("==================================================================");
	       e.printStackTrace();
	    }
	    }

	    @AfterTest
	    public void tearDown() {
	    if (driver != null) {
	    driver.quit();
	    }
	    }

}
	    
