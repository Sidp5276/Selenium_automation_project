package example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    public static void main(String[]args) throws InterruptedException
    {
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("999999");
Thread.sleep(1000);
driver.findElement(By.name("pass")).sendKeys("keys");
Thread.sleep(1000);
driver.findElement(By.linkText("Forgotten password?")).click();
Thread.sleep(1000);
driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");
driver.navigate().back();
driver.findElement(By.partialLinkText("Forgotten")).click();
Thread.sleep(2000);
driver.navigate().back();
driver.findElement(By.className("_8esh")).click();
Thread.sleep(1000);
driver.navigate().back();
driver.navigate().forward();
driver.navigate().back();
driver.close();
    }
    
}
