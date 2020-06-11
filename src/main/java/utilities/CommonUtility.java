package utilities;

import java.util.ArrayList;
import java.util.List;

import base.TestBase;
import outcomes.FailureOutcome;
import outcomes.Outcome;
import outcomes.SuccessOutcome;

public class CommonUtility extends TestBase {

	TestBase base = new TestBase();

	/**
	 * To return Failure outcome
	 * 
	 * @param fileName
	 * @param message
	 * @return
	 */
	public FailureOutcome returnFailureOutcome(String fileName, String message) {
		base.takeScreenShot(fileName);
		return new FailureOutcome(message);
	}

	/**
	 * get coloumns from excel which has data
	 * 
	 * @param data
	 * @param FEILDS
	 * @return
	 */
	public List<String> getFinalFeilds(String[] formData, String[] FIELDS) {
		List<String> formFeild = new ArrayList<>();
		for (int i = 0; i <= formData.length - 1; i++) {
			if (formData[i] != "") {
				formFeild.add(FIELDS[i]);
			}
		}
		return formFeild;
	}

	/**
	 * get coloumns from excel which has data
	 * 
	 * @param data
	 * @param FIELDS
	 * @return
	 */
	public List<String> getFinalData(String[] formData, String[] FIELDS) {
		List<String> data = new ArrayList<>();
		for (int i = 0; i <= formData.length - 1; i++) {
			if (formData[i] != "") {
				data.add(formData[i]);
			}
		}
		return data;
	}
	
	
	public String[] flatten(String[][] data) {
	    ArrayList<String> list = new ArrayList<String>();

	    for(int i = 0; i < data.length; i++) {
	        for(int j = 0; j < data[i].length; j++){
	            list.add(data[i][j]);
	        }
	    }

	    return list.toArray(new String[0]);
	}
	





}
