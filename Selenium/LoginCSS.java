package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginCSS {

	WebDriver driver;

	public static void main(String[] args) {
		LoginCSS loginObj = new LoginCSS();
		loginObj.login();
		loginObj.goToAdminTab();
		loginObj.selectUserRole();
		loginObj.clickOnSearchButton();
		loginObj.logout();

	}

	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vesna\\eclipse-workspace\\SeleniumProject\\src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();

	}

	public void goToAdminTab() {
		driver.findElement(By.cssSelector("a[id='menu_admin_viewAdminModule'] b")).click();
	}

	public void selectUserRole() {
		Select dropdown = new Select(driver.findElement(By.cssSelector("#searchSystemUser_userType")));
		dropdown.selectByVisibleText("ESS");
	}

	public void clickOnSearchButton() {
		driver.findElement(By.cssSelector("#searchBtn")).click();

	}

	public void logout() {
		driver.findElement(By.cssSelector("a#welcome")).click();
		driver.findElement(By.cssSelector("a[href*='/index.php/auth/logout']")).click();

	}

}
