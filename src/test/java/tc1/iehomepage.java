package tc1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class iehomepage {
	@Test
	public void login2()
	{
	 WebDriverManager.iedriver().setup();
	 WebDriver driver=new InternetExplorerDriver();
	 driver.get("http://automationpractice.com/index.php?");
	}
	}


