package pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.CommonUtility;
import utilities.WebForm;

public class OrderDetailsScreen extends TestBase {

	TestBase base = new TestBase();

	CommonUtility commonUtility = new CommonUtility();

	WebForm webForm = new WebForm();

	final String selectedTab = "//div[@class='text-primary od-text-primary tab-icon']/div";

//	final String selectedCategory = "//button[@type='button'][@class='orders_category__3qtrD orders_selectedCategory__38Rp7']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__3lpLF orders_selectedCategory__1K3uK']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__zri33 orders_selectedCategory__XHgn2']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__Gt4ys orders_selectedCategory__2EGCq']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__3IPVa orders_selectedCategory__1jTh2']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__1_qRB orders_selectedCategory__2jPKa']";
//	Changed XPATH
	final String selectedCategory = "//button[@type='button'][@class='orders_category__9KyuI orders_selectedCategory__-PJsa']";

//	final String menu_Item = "//div[@class='orders_itemName__2Wt62 fw-700'][text()='temp']";
//	final String menu_Item = "//div[@class='orders_itemName__3tT2n fw-700'][text()='temp']";
//	final String menu_Item = "//div[@class='orders_itemName__1CSbE fw-700'][text()='temp']";
//	final String menu_Item = "//div[@class='orders_itemName__dvitJ fw-700'][text()='temp']";
//	final String menu_Item = "//div[@class='orders_itemName__1jLPF fw-700'][text()='temp']";
//	Changed XPATH
	final String menu_Item = "//div[@class='orders_itemName__QDULD fw-700'][text()='temp']";

//	final String orderMenu = "//div[@class='orders_itemName__2Wt62 fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	final String orderMenu = "//div[@class='orders_itemName__3tT2n fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	final String orderMenu = "//div[@class='orders_itemName__1CSbE fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	final String orderMenu = "//div[@class='orders_itemName__dvitJ fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	final String orderMenu = "//div[@class='orders_itemName__1jLPF fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	Changed XPATH
	final String orderMenu = "//div[@class='orders_itemName__QDULD fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
	
	
//	final String addToBag = "//button[@type='button'][@class='orderItem_btnUpdated__2ztXy orderItem_buttonContainer__2If4B btn-primary w-100']";
//	final String addToBag = "//button[@type='button'][@class='orderItem_btnUpdated__nDJAT orderItem_buttonContainer__1o5bw btn-primary w-100']";
//	final String addToBag = "//button[@type='button'][@class='orderItem_btnUpdated__w5-YO orderItem_buttonContainer__1l7Ho btn-primary w-100']";
//	final String addToBag = "//button[@type='button'][@class='orderItem_btnUpdated__2engT orderItem_buttonContainer__191V7 btn-primary od-btn-primary w-100']";
//	Changed XPATH
	final String addToBag = "//button[text()='Add to Bag']";
	
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
			System.out.println("Scrolling");
			base.scrollToElementUsingJS(coffee_MenuItem);
			System.out.println("Scrolled");
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
