

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkart {
	WebDriver driver;

	@Given("Driver launch for Chrome")
	public void driver_launch_for_Chrome() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@And("User enter Url address {string}")
	public void user_enter_Url_address(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> row = driver.findElements(By.xpath("//font[contains(text(),'Atlanta')]//parent::td/parent::tr/parent::tbody//tr"));
		List<WebElement> col = driver.findElements(By.xpath("//font[contains(text(),'Atlanta')]//parent::td/parent::tr/parent::tbody//tr/td[1]"));

		System.out.println(row.size());
		System.out.println(col.size());
		
		
		WebElement rowvalue = driver.findElement(By.xpath("//font[contains(text(),'Atlanta')]//parent::td/parent::tr/parent::tbody//tr[4]"));
		String text = rowvalue.getText();
		System.out.println(text);
		
		
		/*File file =    new File("C:\\Users\\yuvar\\Downloads\\ss\\robo.xlsx");
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		sheet.createRow(0).createCell(0).setCellValue(text2);
		FileOutputStream fos = new FileOutputStream(file);
		book.write(fos);*/
		


	}

	@Then("search and list flights")
	public void search_and_list_flights() throws InterruptedException
	{

		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		System.out.println(signup.getText());
		Thread.sleep(2000);
		try
		{
			WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
			from.click();
		}

		catch(Exception e) {
			
		}
		
		try
		{
			WebElement from = driver.findElement(By.xpath("//span[text()='Round Trip']"));
			from.click();
		}

		catch(Exception e) {
			
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys("Bangalore" +Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='To']")).click();




	}



}