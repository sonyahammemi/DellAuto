package TestSuites;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Helper.Config;
import Helper.utils;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	
	@Given("admin is on homepage")
	public void admin_is_on_homepage() throws Exception {
		Config.ConfigChrome();
		Config.maximizeWindow();
		Config.navigate(utils.getproperty("Web_Portal_Link"));

	}
	
	@After
	public void tearDown(Scenario sc) {
		if(sc.isFailed()) {
			File screenShotSource = ((TakesScreenshot)Config.driver).getScreenshotAs(OutputType.FILE);
			File screenshotDestination = new File("C:\\screenshot\\failSc.png");
			try {
				FileUtils.copyFile(screenShotSource, screenshotDestination);
			}catch (Exception e) {
				// TODO: handle exception
			}
				
			}
		}
	}


