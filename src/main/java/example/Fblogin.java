package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

import static java.lang.Thread.sleep;

class FbLogin {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter username/phone number");
        String un=sc.next();
        System.out.println("please enter password");
        String pw=sc.next();

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys(un);
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys(pw);
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(4000);
        driver.close();
    }
}
