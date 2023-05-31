import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaazTestCases {
	public WebDriver driver;

	@BeforeTest()
	public void before_test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.baaz.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void navigate_between_static_pages() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/div[1]/a[2]")).click();

		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/div[1]/a[3]")).click();

		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/div[1]/a[4]")).click();

		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/div[1]/a[1]")).click();

	}

	@Test(priority = 2)
	public void marketing_section() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("/html/body/nav/div/div/div/div[1]/div[2]/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"features-menu-link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"news-menu-link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"about-menu-link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"news-menu-link\"]")).click();
		// ======================================================================
		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[1]/div[1]/a/div[1]/img")).click();

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[1]/div[2]/a/div[1]/img")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[1]/div[3]/a/div[1]/img")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/ul/li[2]/a")).click();

		// driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[1]/div[4]/a/div[1]/img")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/ul/li[2]/a")).click();

		// this is dot click
		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[2]/span[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[1]/div[5]/a/div[1]/img")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/ul/li[2]/a")).click();

		// this is dot click
		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[2]/span[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[1]/div[6]/a/div[1]/img")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/ul/li[2]/a")).click();

		// this is dot click
		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[2]/span[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[1]/div[7]/a/div[1]/img")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/ul/li[2]/a")).click();

		// this is dot click
		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[2]/span[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"news-section\"]/div/div[2]/div/div/div[1]/div[8]/a/div[1]/img")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/ul/li[2]/a")).click();

		// ======================================================================
		driver.findElement(By.xpath("//*[@id=\"team-menu-link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"contact-menu-link\"]")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div/div/div[1]/div[2]/div/div/ul/li[6]/a")).click();

	}

}
