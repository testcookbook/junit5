import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCookbookHomeTest {
	
	@Test
	public void hasTitle() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.testcookbook.com");

		assertEquals(driver.getTitle(), "Test Cookbook");

		driver.quit();
	}

}