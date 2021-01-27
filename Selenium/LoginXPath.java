package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginXPath {

	WebDriver driver;

	public static void main(String[] args) {

		LoginXPath loginObj = new LoginXPath();
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
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	public void goToAdminTab() {
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	}

	public void selectUserRole() {
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']")));
		dropdown.selectByVisibleText("ESS");
	}

	public void clickOnSearchButton() {
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();

	}

	public void logout() {
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();

	}

}
