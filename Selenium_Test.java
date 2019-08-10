import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Selenium_Test {
	public static void main(String[] args)
	{

	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("--no-sandbox");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("http://54.86.52.191/");
		String x = driver.getTitle();
		System.out.println(x);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementById("About Us").click();
		String text=driver.findElementById("PID-ab2-pg").getText();
		System.out.println(text);

	if (text.contains("This is about page")) {
		
		 System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}
	}
