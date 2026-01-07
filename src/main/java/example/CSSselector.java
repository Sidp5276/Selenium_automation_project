package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSselector {

    //1st way (through ID)
    //testing id
    //input#username
public static void main(String[] args) throws InterruptedException
{
    WebDriver driver= new ChromeDriver();
    driver.get("https://login.salesforce.com/?locale=in");
    driver.manage().window().maximize();

    driver.findElement(By.cssSelector("input#username")).sendKeys("987456321");
    Thread.sleep(1000);


    //2nd way (through class)
    //testing password
    //input.password
    driver.findElement(By.cssSelector("input.password")).sendKeys("password");
    Thread.sleep(1000);

    //3rd way (generic way)
    //attribute='value'
    //input[type='email']
    driver.findElement(By.cssSelector("input[type='email']")).clear();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[id='username']")).sendKeys("123456789");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[name='Login']")).click();
    Thread.sleep(1000);
    driver.close();
}

}
