package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginNG {
    WebDriver dr = new ChromeDriver();
    
    public void f1() {
    	JavascriptExecutor js=(JavascriptExecutor)dr;
    	js.executeScript("window.scrollBy(0,8000)");
    }
    @Test
    @Parameters({"username","password"})
    public void f(String username, String password) throws InterruptedException {
    Thread.sleep(1000);
    WebElement we=dr.findElement(By.name("username"));
   // we.sendKeys("practice");
    we.sendKeys(username);
    
    WebElement we1=dr.findElement(By.id("password"));
    //we1.sendKeys("SuperSecretPassword!");
    we1.sendKeys(password);
    
    dr.findElement(By.xpath("//button[@id='submit-login']")).click();
    }
    
    @BeforeTest
    public void beforeTest() {
    dr.manage().window().maximize();
    dr.get("https://practice.expandtesting.com/login");
}

    @AfterTest
    public void afterTest() throws InterruptedException {
    Thread.sleep(6000);
    dr.close();
  }
}
