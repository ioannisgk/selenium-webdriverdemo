package com.ioannisgk.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.remote.DriverCommand.SET_WINDOW_SIZE;

public class GoogleTest {

    public void googleTest() throws InterruptedException {

        // initialize web browser
        System.setProperty("webdriver.chrome.driver", "src/chromedriver");

        ChromeOptions options1 = new ChromeOptions();
        options1.addArguments(SET_WINDOW_SIZE);

        options1.addArguments("--no-sandbox");
        options1.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options1);


        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // go to the website
        driver.get("https://google.com");


        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input"));
        searchField.sendKeys("My Text");

        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[3]/center/input[1]"));
        searchButton.click();


        Thread.sleep(2000);
        driver.quit();
    }
}
