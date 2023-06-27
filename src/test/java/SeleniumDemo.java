import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.SortedMap;

public class SeleniumDemo {
    public static void main(String[] args) {

//        ChromeDriver dr = new ChromeDriver();
        WebDriver driver = null;

        try {


             driver = new ChromeDriver();

            driver.get("https://www.duotech.io/");
            String expected = "Software QA Automation Engineer program | SDET | QA School | Software Testing";
            String actualTitle = driver.getTitle();


//        System.out.println(actualTitle);

//        if(actualTitle.equalsIgnoreCase(expected)){
//            System.out.println(" Test Passed");
//        }else {
//            System.out.println("Test Failed");
//        }


            Assert.assertEquals(actualTitle, expected);
        }finally {

           driver.quit();

        }
    }
}
