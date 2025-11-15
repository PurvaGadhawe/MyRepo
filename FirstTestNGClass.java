package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {
  @Test
  public void Login() {
	  System.out.println("I Am In Test Case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I Am In Before Method");
  }

//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("I am In After Method");
//  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am In Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I Am In After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I Am In Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I Am In After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am In Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I Am In After Suite");
  }
  
  
  @Test
  public void Login1() {
	  System.out.println("I Am In Test Case");
  }

}
