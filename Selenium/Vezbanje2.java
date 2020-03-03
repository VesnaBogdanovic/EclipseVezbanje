package vezbanjeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vezbanje2 {

	public static void main(String[] args) {
	// Idem na youtube, 5 puta klikcem na dugme refresh i tek onda zatvaram pretrazivac
		
		System.setProperty("webdriver.chrome.driver", "src\\vezbanjeSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/?hl=sr&gl=RS");	
		int i=0;
		while( i<5 ) {
		driver.navigate().refresh();
		i++; }
		
		driver.quit();
	
	}
}
