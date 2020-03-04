package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChildWindow extends MainWindow {
	
	public static WebElement input1 = null;
	public static WebElement input2 = null;

	public static void proceedToCheckout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input = driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input"));
		input.click();
	}
	
	public static void inputMobileNumber() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("PhoneNo");
		int row = sheet.getLastRowNum() +1;
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(cell);
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				
//				Cell Cell=sheet.getRow(i).getCell(j);
//				sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				
//				String input=String.valueOf(data);
				
//				String num = Integer.toString(data);
				input1 = driver.findElement(By.id("ap_email"));
				input1.sendKeys(data);
				
			}
		}
		
	}

	public static void clickContinueButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		input1.submit();
	}
	
	public static void inputPassword() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Password");
		int row = sheet.getLastRowNum() +1;
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(cell);
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				input2 = driver.findElement(By.id("ap_password"));
				input2.sendKeys(data);
			}
		}
	}
	
	public static void clickOnLoginButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input3 = driver.findElement(By.id("signInSubmit"));
		input3.click();
	}
	
	public static void closeCurrentWindow() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.close();
	}
	
	public static void switchToMainwindow() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().window(parentid);
		
	}
	
	public static void clickOnCart() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement input4 = driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]"));
		input4.click();
	}
	
	public static void clickDeleteCartButton() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement input5 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[5]/div[1]/div[2]/div[2]/form[1]/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[2]/span[1]/input[1]"));
		input5.click();
		driver.close();
		driver.switchTo().window(childid);
		driver.close();
	}
	
}
