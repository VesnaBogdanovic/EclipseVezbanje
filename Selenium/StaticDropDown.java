package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Kad se tag zove select,znaci da je staticni dropdown, imam specijalnu klasu za select dropdown
public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vesna\\eclipse-workspace\\SeleniumProject\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		/*
		 * Drugi nacin selektovanja teksta u dropdown
		 * dropdown.selectByVisibleText("AED"); Treci nacin
		 * dropdown.selectByValue("AED");
		 */

	}

}
