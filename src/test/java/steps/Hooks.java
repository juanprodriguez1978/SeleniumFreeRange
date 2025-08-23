package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;

public class Hooks extends BasePage {

    @Before
    public void setUp() {
        // Inicializa el WebDriver solo si aún no se ha inicializado
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    }

    @After
    public void tearDown() {
        // Cierra el navegador solo si el driver no es null
        if (driver != null) {
            driver.quit();
        }
    }
}