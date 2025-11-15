package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() throws InterruptedException {
      
      WebDriver dr = new ChromeDriver();
      dr.get("https://practicetestautomation.com/practice-test-login/\n");
      WebElement we1=dr.findElement(By.xpath("//a[text()='Privacy Policy']"));
      JavascriptExecutor js =(JavascriptExecutor) dr;
      js.executeScript("arguments[0].scrollIntoView(true);", dr);
      
     js.executeScript("window.scrollBy(0,700)"); //scroll down
      Thread.sleep(3000);
      js.executeScript("window.scrollBy(0,-300)"); //scroll up
//      
      
  }
}

