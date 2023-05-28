package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\New Eclipse EE workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		
		WebDriver webdriver = new ChromeDriver();
		
		webdriver.manage().window().maximize();
		webdriver.get("https://career.infosys.com/jobdesc?jobReferenceCode=INFSYS-EXTERNAL-155306&sourceId=4003");
		Thread.sleep(3000);
		webdriver.findElement(By.className("button")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.name("firstnameX")).sendKeys("Shriyash");
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/register[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Madan");
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/register[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Mangaonkar");
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/register[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("yourname@gmail.com");
		Thread.sleep(2000);
		webdriver.findElement(By.name("passwordX")).sendKeys("Password@123");
		Thread.sleep(2000);
		webdriver.findElement(By.name("cpasswordX")).sendKeys("Password@123");
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/register[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")).click();
		webdriver.quit();
	}

}
