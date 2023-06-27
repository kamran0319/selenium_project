import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");

        Thread.sleep(1000);
//        WebElement usernameField = driver.findElement(By.name("username"));
//        usernameField.sendKeys("johndoe@gmail.com");
        driver.findElement(By.name("username")).sendKeys("johndoe@gmail.com");


        driver.findElement(By.name("password")).sendKeys("kjhkjhjkh");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/");


         String expected = "There was a problem logging you into Instagram. Please try again soon.";

        Thread.sleep(1000);
                 String actualErrorMessage = driver.findElement(By.id("slfErrorAlert")).getText();

        System.out.println(actualErrorMessage);
                 Assert.assertEquals(actualErrorMessage,expected);




    }
}
