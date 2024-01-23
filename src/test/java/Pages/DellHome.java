package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DellHome {
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li/button/span")
	List<WebElement> menus;
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li/button")
	List<WebElement> submenus;
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[3]/ul/li/a")
	List<WebElement> productList;
	
	public DellHome(WebDriver driver) {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverOnMenu(String menuTitle, String submenuTitle) {
		for(WebElement menu:menus) {
			Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			if(menu.getText().contains(menuTitle)) {
				Config.actions = new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();
				for(WebElement submenu:submenus) {
					if(submenu.getText().contains(submenuTitle)) {
						Config.actions.moveToElement(submenu).perform();
					}
				}
			}
		}
	
		
	}
	
	public void clickOnProduct(String productName) {
		try {
			for(WebElement product:productList) {
				if(product.getText().contains(productName)) {
					product.click();
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
