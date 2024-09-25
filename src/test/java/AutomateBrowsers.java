import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateBrowsers {
    public static void main(String[] args) {
//        WebDriverManager.firefoxdriver();
//        WebDriver driver = new FirefoxDriver();

        WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
    }
}
