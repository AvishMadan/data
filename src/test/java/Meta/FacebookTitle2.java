package Meta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTitle2 {

	@Test
	public void title() 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	//	Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
	}
	
	
}
