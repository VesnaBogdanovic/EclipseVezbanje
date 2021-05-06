package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vesna\\eclipse-workspace\\SeleniumProject\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Unosim ind da dobijem listu elemenata koji se podudaraju
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);

		// Prvo dobijem listu elemenata-parent,space,childTag i smestim u varijablu
		// options
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		// Sada zelim da iteriram kroz sve opcije i nadjem podudaranje sa
		// zeljenom,prekidam kad nadjem podudaranje
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

	}

}
