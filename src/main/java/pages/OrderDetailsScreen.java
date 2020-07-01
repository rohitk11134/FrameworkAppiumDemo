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

//	final String selectedCategory = "//button[@type='button'][@class='orders_category__3qtrD orders_selectedCategory__38Rp7']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__3lpLF orders_selectedCategory__1K3uK']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__zri33 orders_selectedCategory__XHgn2']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__Gt4ys orders_selectedCategory__2EGCq']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__3IPVa orders_selectedCategory__1jTh2']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__1_qRB orders_selectedCategory__2jPKa']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__9KyuI orders_selectedCategory__-PJsa']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__25owi orders_selectedCategory__35a74']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__1zRNz orders_selectedCategory__LToH3']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__1Vq9H orders_selectedCategory__1ZHyv']";	
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__2qarS orders_selectedCategory__3l2M6']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__D6EsT orders_selectedCategory__2UpPQ']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__2hk8C orders_selectedCategory__36WOV']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__3NoT2 orders_selectedCategory__13IPp']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__2QRG7 orders_selectedCategory__ddXGO']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__3aexi orders_selectedCategory__12O6R']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__2ykF1 orders_selectedCategory__1tfq8']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__3zNUJ orders_selectedCategory__6nJmW']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__1rv0F orders_selectedCategory__XEwdL']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__Yi0dU orders_selectedCategory__1VNUD']";
//	final String selectedCategory = "//button[@type='button'][@class='orders_category__8CxDf orders_selectedCategory__rNuEd']";
//	Changed XPATH
	final String selectedCategory = "//button[@type='button'][@class='orders_category__1WgIL orders_selectedCategory__3INlq']";

//	final String menu_Item = "//div[@class='orders_itemName__2Wt62 fw-700'][text()='temp']";
//	final String menu_Item = "//div[@class='orders_itemName__3tT2n fw-700'][text()='temp']";
//	final String menu_Item = "//div[@class='orders_itemName__1CSbE fw-700'][text()='temp']";
//	final String menu_Item = "//div[@class='orders_itemName__dvitJ fw-700'][text()='temp']";
//	final String menu_Item = "//div[@class='orders_itemName__1jLPF fw-700'][text()='temp']";
//	final String menu_Item = "//div[@class='orders_itemName__QDULD fw-700'][text()='temp']";
//	Changed XPATH
	final String menu_Item = "//div[text()='temp']/ancestor::div[2]";

//	final String orderMenu = "//div[@class='orders_itemName__2Wt62 fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	final String orderMenu = "//div[@class='orders_itemName__3tT2n fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	final String orderMenu = "//div[@class='orders_itemName__1CSbE fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	final String orderMenu = "//div[@class='orders_itemName__dvitJ fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	final String orderMenu = "//div[@class='orders_itemName__1jLPF fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	final String orderMenu = "//div[@class='orders_itemName__QDULD fw-700'][text()='temp']/ancestor::div[1]/descendant::button";
//	Changed XPATH
	final String orderMenu = "//div[text()='temp']/ancestor::div[1]/descendant::button[@type='button']";

	String categoryToClick = "//button[text()='temp']";
	
	String modifier_Xpath = "//div[text()='temp']";

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
			if (!actual_SelectedCategory.toLowerCase().trim()
					.equalsIgnoreCase(expectedCategoryName.toLowerCase().trim())) {
				categoryToClick = categoryToClick.replace("temp", expectedCategoryName);
				base.tapElement(categoryToClick);
				actual_SelectedCategory = base.gettext(selectedCategory);
				Assert.assertEquals(actual_SelectedCategory.toLowerCase().trim(),
						expectedCategoryName.toLowerCase().trim(),
						"Selected Category name matches with the expected Category name");
			}
			Assert.assertEquals(actual_SelectedCategory.toLowerCase().trim(), expectedCategoryName.toLowerCase().trim(),
					"Selected Category name matches with the expected Category name");
		} else {
			Assert.assertNull(base.getElement(XPATH, selectedCategory), "Category is not selected");
		}
	}

	public void scrollDownToMenuItem(String menuItem) {

		storedMenuItem = menuItem;
		String menuItemToBeClicked = menu_Item.replace("temp", menuItem);
		if (base.getElement(XPATH, menuItemToBeClicked) != null) {
			base.scrollToElementUsingJS(menuItemToBeClicked);
			base.tapElement(menuItemToBeClicked);
			base.delay(1500L);
		} else {
			Assert.assertNull(base.getElement(XPATH, menuItemToBeClicked), "Coffee menu item is not available");
		}

	}

	public void tapOrderMenuButton(String input) {

		String order_Menu = orderMenu.replace("temp", input);

		System.out.println("Order Menu button :::  " + order_Menu);

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

	public void selectRequiredModifiers(String modifier1, String modifier2, String modifier3) {
		
		String modifier1_Xpath = modifier_Xpath.replace("temp", modifier1);
		String modifier2_Xpath = modifier_Xpath.replace("temp", modifier2);;
		String modifier3_Xpath = modifier_Xpath.replace("temp", modifier3);;
		
		if (base.getElement(XPATH, modifier1_Xpath) != null && base.isDisplayed(modifier1_Xpath)) {
			base.tapElement(modifier1_Xpath);
			base.delay(1500L);
			if (base.getElement(XPATH, modifier2_Xpath) != null) {
				base.scrollToElementUsingJS(modifier2_Xpath);
				base.delay(1500L);
				base.tapElement(modifier2_Xpath);
				base.delay(1500L);
				if (base.getElement(XPATH, modifier3_Xpath) != null) {
					base.scrollToElementUsingJS(modifier3_Xpath);
					base.delay(1500L);
					base.tapElement(modifier3_Xpath);
					base.delay(1500L);
				} else {
					Assert.fail(modifier3_Xpath + " element is not found");
				}
			} else {
				Assert.fail(modifier2_Xpath + " element is not found");
			}
		} else {
			Assert.fail(modifier1_Xpath + " element is not found");
		}
	}

}
