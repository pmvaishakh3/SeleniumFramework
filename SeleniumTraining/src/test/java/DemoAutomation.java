//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\browserdriver\\chromedriver.exe");
		//System.setProperty("webdriver.geko.driver","C:\\browserdriver\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\browserdriver\\msedgedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		//driver.get("http://www.selenium.dev/selenium/web/web-form.html");

	}

}
