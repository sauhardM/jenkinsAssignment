import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoClass {

	public static WebDriver driver;
	public static String browser, Mode;
	
	
	@Test             
	public void test() {      
	// set the system property for Chrome driver      
	WebDriverManager.chromedriver().setup();
	// Create driver object for CHROME browser  
	driver = new ChromeDriver();  
	driver.manage().window().maximize();  
	driver.get("https://www.google.com/");  
	// get the current URL of the page  
	String URL= driver.getCurrentUrl();  
	System.out.print(URL);  
	//get the title of the page  
	String title = driver.getTitle();                  
	System.out.println(title);  
	}     
}
	