import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class start {

	public static  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		
		System.setProperty("webdriver.ie.driver","C:/Users/Tonya/Desktop/selenium/IEDriverServer.exe");
		//WebDriver driver=new FirefoxDriver();
		
		WebDriver driver1 = new InternetExplorerDriver();
		//driver.get("https://google.com");
		//driver.get("http://wikipedia.org");
		
		//https://www.google.co.in/
			//driver.get("https://www.google.co.in/");
		
			
			
			driver1.get("https://www.google.co.in/");
			driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver1.manage().window().maximize();
			driver1.findElement(By.name("q")).sendKeys("india");
			driver1.findElement(By.name("q")).submit();
			Thread.sleep(5);
			driver1.findElement(By.xpath("//*[contains(text(),'Wikipedia')]")).click();
			Thread.sleep(5);
			System.out.println(driver1.findElements(By.xpath("//table[@class='infobox geography vcard']/tbody/tr")).size());
			
		
			//driver1.navigate().back();
			//driver1.navigate().forward();
		
		/*String winhandle=driver.getWindowHandle();
		
		driver.findElement(By.xpath(".//*[@id='searchInput']")).sendKeys("HP QTP");
		driver.findElement(By.name("go")).click();
		
		
		Thread.sleep(5000);
		
		System.out.println (driver.findElement(By.xpath(".//*[@id='mw-content-text']/div[3]/ul/li[1]/div[1]/a")).getText());
		
		
		driver.findElement(By.xpath(".//*[@id='mw-content-text']/div[3]/ul/li[1]/div[1]/a")).click();
		
		
		driver.switchTo().window(winhandle);
		
		
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 
		driver.switchTo().window(tabs.get(0));
		
		driver.navigate().to("https://www.google.com");
				
		
		
		driver.switchTo().window(winhandle);
		
		driver.navigate().to("www.wikipedia.org");
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(driver.getTitle());
		
		
		
		
		
		
		//WebElement webelemtn=driver.findElement(By.name("q"));
		//webelemtn.sendKeys("happy");
	//	webelemtn.submit();*/
		
		
	}

}
