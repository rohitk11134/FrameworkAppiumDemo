package utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.testng.Assert;

import base.TestBase;
public class WebForm extends TestBase {

	TestBase base = new TestBase();
	CommonUtility commonUtility = new CommonUtility();

	public void enterData(String[][] formData, String[] FIELDS) {
		String tagName = "";
//		Outcome outcome = null;
		
		String[] testData = commonUtility.flatten(formData);
		for (int i = 0; i <= FIELDS.length - 1; i++) {
			tagName = base.getTagName(FIELDS[i]);
			System.out.println("Field  :: "+FIELDS[i]+"   Formdta :: "+testData[i]);
			System.out.println("Tag Name :: "+tagName);
			if (!tagName.equals("NotFound")) {
				inputData(FIELDS[i], tagName, testData[i]);
//				outcome = new SuccessOutcome();
			} else {
				String message = "Input Element not Found :" + FIELDS[i];
//				outcome = commonUtility.returnFailureOutcome("ElementNotFound", message);
				break;
			}
		}
	}

	// Verify Input fields and data from excel
	public boolean checkFormFieldsData(String[][] formData, String[] FIELDS) {
		boolean flag = true;
//		Outcome outcome;
		String[] testData = commonUtility.flatten(formData);
		if (testData.length == FIELDS.length+1) {
			return flag = true;
		} else {
			if (testData.length > FIELDS.length) {
//				outcome = new FailureOutcome("Excel Data has more fields than the actual Form Fields");
				Assert.fail("Excel Data has more fields than the actual Form Fields");
				return flag = false;
			} else {
//				outcome = new FailureOutcome("Excel Data has less fields than the actual Form Fields");
				Assert.fail("Excel Data has less fields than the actual Form Fields");
				return flag = false;
			}
		}
	}
	

	
	/**
	 * To get the actual message keys 
	 * @param actualMessages       actual validation messages from the page
	 * @param pageErrorMessageMap  Error map containing key-value pair
	 * @return  actualValidationMsgKeys  keys of the actual messages
	 */
	public List<String>  getActualErrorMessageKeys(List<String> actualMessages, HashMap<String, String> pageErrorMessageMap){
		List<String> actualValidationMsgKeys = new ArrayList<String>();

		for(String validationMessage : actualMessages) {
	        for (Entry<String, String> me : pageErrorMessageMap.entrySet()) {
	            if(me.getValue().trim().equalsIgnoreCase(validationMessage.trim())) {
	            	actualValidationMsgKeys.add(me.getKey());
	            }
	          }
		}
		return actualValidationMsgKeys;
	}
	

	public void inputData(String field, String tagName, String data) {
		switch (tagName) {

		case "text":
			base.populateFields(field, data);
			break;

		case "email":
			base.populateFields(field, data);
			break;

		case "radio":
			base.tapElement(field);
			break;

		case "select":
			base.tapElement(field);
			base.selectDropdownValue(field, data);
			break;

		case "password":
			base.populateFields(field, data);
			break;

		case "checkbox":
			base.tapElement(field);
			break;

		case "textarea":
			base.populateFields(field, data);
			break;
			
		case "number":
			base.populateFields(field, data);
			break;
			
		case "div":
			base.populateFields(field, data);
			break;
		}
	}

	public void compareMessageKeys(String expectedMessageKeys, List<String> actualValidationMsgKeysList) {
		
		List<String> expectedMessageKeysList = new ArrayList<String>();
		if(expectedMessageKeys.contains(",")) {
			String[] splitKeys = expectedMessageKeys.split(",");
			for(int i =0 ; i<= splitKeys.length-1 ; i++) {
				expectedMessageKeysList.add(splitKeys[i].trim());
			}
		} else {
			expectedMessageKeysList.add(expectedMessageKeys);
		}

		Assert.assertTrue(expectedMessageKeysList.equals(actualValidationMsgKeysList), "Expected and Actual error messages are not matched");

	}

}
