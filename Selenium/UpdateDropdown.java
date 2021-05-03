package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Biram 5 adults sa dropdown liste-4 puta treba da ponovim,jer je 1 adult vec izabran
public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vesna\\eclipse-workspace\\SeleniumProject\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for (int i = 1; i <= 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		// Da vidim da sam zaista izabrala 5 adult koristim metodu getText()
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
