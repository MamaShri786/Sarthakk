package Githubp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gitc {
	@Test
	public static void gettext() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.way2automation.com/");
		WebElement sdc = driver.findElement(By.xpath("//*[@id=\"menu-item-27617\"]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(sdc).perform();
		Thread.sleep(1000);

		driver.findElement(By.linkText("Practice Site 2")).click();
		Thread.sleep(2000);

		Set<String> winds = driver.getWindowHandles();
		Iterator<String> iterate = winds.iterator();
		String first_win = iterate.next();

		driver.switchTo().window(first_win);

		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
		winds = driver.getWindowHandles();
		iterate = winds.iterator();

		System.out.println(iterate.next());
		String second_win = iterate.next();

		driver.switchTo().window(second_win);

		driver.findElement(By.xpath("/html/body/div[1]/div/form/input[1]")).sendKeys("10");

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/form/input[2]")).sendKeys("20");

		driver.findElement(By.tagName("select")).click();

		Thread.sleep(2000);

		WebElement sa = driver.findElement(By.tagName("select"));
		sa.sendKeys("*");
		sa.click();

		driver.findElement(By.xpath("//*[@id=\"gobutton\"]")).click();

		WebElement saa = driver.findElement(By.xpath("/html/body/div[1]/div/form/h2"));
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", saa);
		Thread.sleep(2000);
		System.out.println("printing value:  " + saa.getText());

		driver.switchTo().window(first_win);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/ul/li[6]/a")).click();

		winds = driver.getWindowHandles();
		iterate = winds.iterator();

		System.out.println(iterate.next());
		System.out.println(iterate.next());
		String third_win = iterate.next();

		driver.switchTo().window(third_win);

		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();

		driver.findElement(By.tagName("select")).click();
		WebElement sdffg = driver.findElement(By.tagName("select"));
		sdffg.sendKeys("Harry Potter");
		sdffg.click();

		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

		driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("100000");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/button[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/form/div/input")).sendKeys("300");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(3000);
		if (driver instanceof ChromeDriver) {
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("./Screensdf/pagess.jpg"));
		} else {
			System.out.println("not found");
		}

		List<WebElement> cv = driver.findElements(By.xpath("//tbody/tr"));
		List<WebElement> cb = driver.findElements(By.xpath("//tbody/tr[1]/td"));

		for (int c = 1; c < cv.size(); c++) {
			for (int v = 1; v < cb.size(); v++) {

				System.out.print(driver.findElement(By.xpath("//tbody/tr[" + c + "]/td[" + v + "]")).getText());
			}
			System.out.println();
		}


		
	}

}
