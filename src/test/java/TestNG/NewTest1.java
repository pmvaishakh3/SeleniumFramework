package TestNG;

import org.testng.annotations.Test;
import org.testng.Reporter;

//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.openqa.selenium.edge.EdgeDriver;

public class NewTest1 {
  @Test
  public void test1() {
	  Reporter.log("helo");
	  System.out.print("helo");
	  }
  @Test
  public void beforeTest() {
	  //driver.get("http://www.google.com");
	  Reporter.log("hai before");
	  System.out.println("hai before");
  }

  @Test
  public void afterTest() {
	 
		//driver.manage().window().maximize();
		//driver.close();
	  Reporter.log("helo before");
	  System.out.println("helo before");
  }

}
