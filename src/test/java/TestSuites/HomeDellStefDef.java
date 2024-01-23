package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Pages.DellHome;
import Pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomeDellStefDef {
	

	@When("admin mousehover on menu {string}  and submenu {string}")
	public void admin_mousehover_on_menu_and_submenu(String menuTitle, String submenuTitle) {
		DellHome page = new DellHome(Config.driver);
		page.mouseHoverOnMenu(menuTitle, submenuTitle);

	}

	@When("admin click on produit {string}")
	public void admin_click_on_produit(String productName) {
		DellHome page = new DellHome(Config.driver);
		page.clickOnProduct(productName);

	}

	@Then("admin is directed to the page {string}")
	public void admin_is_directed_to_the_page(String productName) {
		ProductPage product = new ProductPage(Config.driver);
		String actualMsg = product.verifMsg();
		Assert.assertEquals(productName, actualMsg);
		
		Config.driver.quit();

	}




}
