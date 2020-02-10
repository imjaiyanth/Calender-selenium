package test;



	import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.Screenshot;



	public class PDF{

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			 


	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
			
			//	driver.manage().deleteCookieNamed("sessionKey");
			
			//click on any link
				//login page- verify login url
				
			
				driver.get("https://github.com/pazone/ashot");
				Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
				ImageIO.write(sc.getImage (),"PNG",new File ("fullscreenshot.png"));
				File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("/home/kadadmin/Desktop/jai/screenshot.png"));
				
				//FileUtils.copyFile(src,new File("/home/kadadmin/Desktop/jai/screenshot.png"));
				driver.close();
		}}
