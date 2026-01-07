package example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args)
    {
        //input[@id='username'] //username

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/?locale=in");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("123456789");

        //input[@name='pw'] //password
        driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("password");

        //input[@value='Log In']   //login
driver.findElement(By.xpath("//input[@value='Log In']")).click();
driver.close();
    }
}
