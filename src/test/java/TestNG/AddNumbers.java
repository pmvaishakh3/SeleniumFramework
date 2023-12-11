package TestNG;

import org.testng.annotations.Test;
import org.testng.Reporter;

//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.AddNumbers;
//import org.openqa.selenium.edge.EdgeDriver;

public class AddNumbers{
  @Test
  public static void main (String[] args) {
	  Reporter.log("sub");
	  int a=10;
	  int b=20;
	  int c=a+b;
	  System.out.printf("c= ", +c);
	  }
  //@Test
 // public void beforeTest() {
	  //driver.get("http://www.google.com");
	//  Reporter.log("hai before");
	//  System.out.println("hai before");
 // }

  //@Test
  //public void afterTest() {
	 
		//driver.manage().window().maximize();
	//	//driver.close();
	  //Reporter.log("helo before");
	  //System.out.println("helo before");
  //}

}