import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo2 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");

        String expectedUrl = "https://www.instagram.com/";

         String actualUrl = driver.getCurrentUrl();
        System.out.println("ActualUrl: "+actualUrl);

        Assert.assertEquals(actualUrl,expectedUrl);


    }
}
