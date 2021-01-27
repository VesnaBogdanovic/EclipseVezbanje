package vezbanjeSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Vezbanje1 {

	public static void main(String[] args) {
		/* Vezbam najosnovnije stavke u Seleniumu- Idem na sajt po zelji, primenjujem metode back,forward,refresh.
		 * Maksimizujem prozor, a pre zatvaranja ga vracam na prvobitnu velicinu. Vracam duzinu naslova,
		 * ispisujem naslov stranice */

		System.setProperty("webdriver.chrome.driver", "src\\vezbanjeSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/java/");
		System.out.println(driver.manage().window().getSize());  //(1050. 708)
			
		driver.manage().window().maximize();
		driver.navigate().to("https://www.chess.com/");
		driver.navigate().to("http://www.perpetualcheck.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Dimension d = new Dimension(1050,708);
		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String PageTitle = driver.getTitle();
		int PageLength = PageTitle.length();  
		System.out.println(" Naslov stranice je : " + PageTitle );
		System.out.println(" Duzina naslova stranice je : " + PageLength);
		
		driver.quit();

	}

}
