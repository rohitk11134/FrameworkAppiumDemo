package pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.TestBase;
import utilities.CommonUtility;
import utilities.WebForm;

public class OrderDetailsScreen extends TestBase {

	TestBase base = new TestBase();

	CommonUtility commonUtility = new CommonUtility();

	WebForm webForm = new WebForm();

	final String selectedTab = "//div[@class='text-primary od-text-primary tab-icon']/div";

	final String selectedCategory = "//button[@type='button'][@class='orders_category__3qtrD orders_selectedCategory__38Rp7']";

	final String menu_Item = "//div[@class='orders_itemName__2tLGY fw-700'][text()='temp']";

	final String orderMenu = "//div[@class='orders_itemName__2tLGY fw-700'][text()='temp']/ancestor::div[1]/descendant::button";

	final String addToBag = "//button[@type='button'][@class='orderItem_btnUpdated__1gI_D orderItem_buttonContainer__2X1ww btn-primary w-100']";

	final String menuItemName = "//div[@id='itemName']/h3";

	String storedMenuItem = "";

	public void verifyActiveScreen(String expectedTabName) {

		if (base.getElement(XPATH, selectedTab) != null) {
			String actual_SelectedTab = base.gettext(selectedTab);
			Assert.assertEquals(actual_SelectedTab.trim(), expectedTabName.trim(),
					"Selected tab name do not matche with the expected tab name");
		} else {
			Assert.assertNull(base.getElement(XPATH, selectedTab), "Tab is not selected");
		}
	}

	public void verifySelectedCategory(String expectedCategoryName) {

		if (base.getElement(XPATH, selectedCategory) != null) {
			String actual_SelectedCategory = base.gettext(selectedCategory);
			Assert.assertEquals(actual_SelectedCategory.toLowerCase().trim(), expectedCategoryName.toLowerCase().trim(),
					"Selected Category name matches with the expected Category name");
		} else {
			Assert.assertNull(base.getElement(XPATH, selectedCategory), "Category is not selected");
		}
	}

	public void scrollDownToMenuItem(String menuItem) {

		storedMenuItem = menuItem;
		String coffee_MenuItem = menu_Item.replace("temp", menuItem);

		if (base.getElement(XPATH, coffee_MenuItem) != null) {
			base.scrollToElementUsingJS(coffee_MenuItem);
			base.tapElement(coffee_MenuItem);
		} else {
			Assert.assertNull(base.getElement(XPATH, coffee_MenuItem), "Coffee menu item is not available");
		}

	}

	public void tapOrderMenuButton(String input) {

		String order_Menu = orderMenu.replace("temp", input);

		if (base.getElement(XPATH, order_Menu) != null) {
			base.tapElement(order_Menu);
		} else {
			Assert.assertNull(base.getElement(XPATH, order_Menu), "Order Menu button is not available");
		}

	}

	public void verifyMenuDetailsScreen() {

		if (base.getElement(XPATH, menuItemName) != null) {
			if (base.isDisplayed(menuItemName)) {
				String actualMenuItemName = base.gettext(menuItemName);
				Assert.assertEquals(storedMenuItem.toLowerCase().trim(), actualMenuItemName.toLowerCase().trim(),
						"Actual and Expected Menu item names do not match");
			} else {
				Assert.assertFalse(base.isDisplayed(menuItemName), "Menu item name is not displayed");
			}
		} else {
			Assert.assertNull(base.getElement(XPATH, menuItemName), "Menu item details are not available");
		}
	}

	public void tapAddToBagButton() {

		if (base.getElement(XPATH, addToBag) != null) {
			if (base.isDisplayed(addToBag)) {
				base.tapElement(addToBag);
				base.delay(3000L);
				wait = new WebDriverWait(this.driver, 5);
			} else {
				Assert.assertFalse(base.isDisplayed(addToBag), "Not able to click Add to Bag button");
			}
		} else {
			Assert.assertNull(base.getElement(XPATH, addToBag), "Add to Bag button is not available");
		}

	}



}
