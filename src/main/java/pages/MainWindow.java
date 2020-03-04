package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainWindow {
	
	public static WebDriver driver = null;
	public static File f = new File("C:\\SeleniumWorkSpace\\Task_AmazonCucumberTest\\Excel\\Amazon.xlsx");
	public static FileInputStream fis;
	public static XSSFWorkbook workbook; 
	public static XSSFSheet sheet;
	public static String parentid;
	public static String childid;
	
	public static void openBrowser() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWorkSpace\\Task_AmazonCucumberTest\\Lib\\chromedriver.exe" );	
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	public static void enterUrl() {
		
		driver.get("https://www.amazon.in/");
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public static void mobileSearch() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("MobileName");
		int row = sheet.getLastRowNum() +1;
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(cell);
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
				input.sendKeys(data);
				input.submit();
			}
		}
	}

	public static void clickFirstLink() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input1 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		input1.click();
	
	}
	
	
	public static void switchToChildWindowAndClickonAddtoCart() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		parentid = it.next();
		System.out.println(parentid);
		
		childid = it.next();
		System.out.println(childid);
		driver.switchTo().window(childid);
		
		WebElement input2 = driver.findElement(By.id("add-to-cart-button"));
		input2.click();
			
	}
	
	
}
