import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
//        String googleSource = driver.getPageSource();
        String googleHandle = driver.getWindowHandle();
//        System.out.println(googleSource);
        System.out.println(googleHandle);
/*        String googleTitle = driver.getTitle();
        System.out.println("Google title is " + googleTitle);
        driver.navigate().to("https://www.udemy.com");
        String udemyTitle = driver.getTitle();
        System.out.println("Udemy title is " + udemyTitle);
        String udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy url is: " + udemyUrl);
        driver.navigate().back();
//        driver.getCurrentUrl();
        String googleUrl = driver.getCurrentUrl();
        System.out.println("Google url is: " + googleUrl);

        driver.manage().window().fullscreen();
//        Thread.sleep(5000);
        driver.navigate().refresh();
        googleUrl = driver.getCurrentUrl();
        System.out.println("Google url is: " + googleUrl);
        driver.navigate().forward();
        udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy url is: " + udemyUrl);
//        Thread.sleep(3000);
*/
        driver.quit();
    }
}
