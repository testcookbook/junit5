import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCookbookHomeTest {
	
	@Test
	public void hasTitle() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.testcookbook.com");

		assertEquals(driver.getTitle(), "Test Cookbook");

		driver.quit();
	}

}