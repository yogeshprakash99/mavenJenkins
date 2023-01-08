package com.excelr.mavenlearning.snapdeal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SnapdealStorageSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"D:\\\\ExcelR_OnlineClasses\\\\Tools\\\\Browser_EXE\\\\edgedriver_win64_108.0.1462.54\\\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().window().maximize();

		driver.get("https://www.snapdeal.com/");
		WebElement computerAndGaming = driver.findElement(By.xpath("//span[normalize-space()='Computers & Gaming']"));
		computerAndGaming.click();
		WebElement storage = driver.findElement(By.xpath("//span[normalize-space()='Pen Drives']"));
		storage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		System.out.println("Scroll down success");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement SixteenGB = driver.findElement(By.xpath("//label[@for='Capacity_s-16GB']"));
		SixteenGB.click();
		System.out.println("Selected 16GB");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement ThirtyTwoGB = driver.findElement(By.xpath("//label[@for='Capacity_s-32GB']"));
		ThirtyTwoGB.click();
		System.out.println("Selected 32GB");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement SixteenGBCancel = driver.findElement(By.xpath(
				"//div[@class='filters-top-selected']//div[@class='filters']//div[@class='navFiltersPill']//a[@data-value='16GB']//span[@class='sd-icon sd-icon-delete-sign marL5']"));
		SixteenGBCancel.click();
		System.out.println("Canceled 16GB");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement ThirtyTwoGBCancel = driver.findElement(By.xpath(
				"//div[@class='filters-top-selected']//div[@class='filters']//div[@class='navFiltersPill']//a[@data-value='32GB']//span[@class='sd-icon sd-icon-delete-sign marL5']"));
		ThirtyTwoGBCancel.click();
		System.out.println("Canceled 32GB");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
