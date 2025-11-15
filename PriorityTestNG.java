package com.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityTestNG {
 
  
  @Test(priority=-2)
  public void Login() {
	  System.out.println("I am Login Successfully");
  }
  
  @Test(priority=1)
  public void Reg() {
	  System.out.println("I m Registration");
  }
  
  @Test(priority='A')
  public void Home() {
	  System.out.println("I m Home");
  }
  
  @Test(priority=4)
  public void abct() {
	  throw new SkipException("WE Are Working ");
	 // System.out.println("I m ABC");
  }
  
  @Test(priority=5,enabled=false)
  public void Logout() {
	  System.out.println("I m Logout");
  }
}
