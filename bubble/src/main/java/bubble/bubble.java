package bubble;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




import io.github.bonigarcia.wdm.WebDriverManager;

public class bubble {
	public static void main(String[] args) throws IOException, InterruptedException {
		/*Initialize the Browser*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*Maximize the screen*/
		driver.manage().window().maximize();
		/*Get the url*/
		driver.get("https://lifescore-beta.getmybubble.io/lifescore");
		/*Dynamically wait for 30 sec*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*Click On Ok which pop up saying you are currently not in united states*/
		try {
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-lifescore-error-alert[1]/div[1]/button[1]")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		Thread.sleep(3000);
		/*Cleared the earlier home address or location*/
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-address-input[1]/div[1]/input[1]")).clear();
		/*Entered the address*/
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-address-input[1]/div[1]/input[1]")).sendKeys("Bangalore");
		/*Selected the Age*/
		WebElement ele=driver.findElement(By.className("small-head-age"));
		Thread.sleep(3000);
		ele.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[. = ' 56 - 65 ']")).click();
		WebElement ele1=driver.findElement(By.className("select-box-input-text"));
		Thread.sleep(3000);
		/*Selected the Male/Female*/
		ele1.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[. = 'Female ']")).click();
		/* Click on request a call back*/
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		/*Enter name*/
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("Prashant Patil");
		/*Enter Email*/
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("prashant@amazeinc.in");
		/*Enter PhoneNo*/
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/div[3]/input[1]")).sendKeys("9975766322");
		/*Click on checkbox*/
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/label[1]/span[1]")).click();
		Thread.sleep(4000);
		/*Click on submit*/
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/button[1]")).click();
		Thread.sleep(3000);
		/*Click on ok*/
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[2]/div[1]/div[1]/div[1]/p[3]/button[1]")).click();
		
		
		

	
	}
}