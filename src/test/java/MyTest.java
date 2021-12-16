import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyTest {
protected WebDriver driver;

@Before
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://shop.md/en/apparel");
    driver.manage().window().maximize();
}
@After
   public void CloseDriver(){
    driver.quit();
}
@Test
    public void ChooseWomanCategoryJersey(){
    driver.findElement(By.xpath("//button[normalize-space()='Apparel']")).click();
    driver.findElement(By.xpath("//a[@class='select-list js-close-filter dropdown-item'][normalize-space()='Women']")).click();
    driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/section[1]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]")).click();
    driver.findElement(By.xpath("//div[@class='swiper-zoom-container']//img")).click();
}
}
