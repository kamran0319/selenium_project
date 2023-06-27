import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GetPageSourse {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");

        String expectedUrl = "Don't have an account?";

        Thread.sleep(1000);

        String pageSource = driver.getPageSource();


        Assert.assertTrue(pageSource.contains(expectedUrl));
//        driver.quit();
        driver.close();
    }
}
