package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	@FindBy(xpath="/html/body/main/div[3]/section[2]/div[1]/div/div/h1/span")
	WebElement verifpage;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifMsg() {
		String actualMsg = verifpage.getText();
		return actualMsg;
	}
}
