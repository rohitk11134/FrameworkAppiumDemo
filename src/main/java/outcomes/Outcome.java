package outcomes;

import java.util.ArrayList;
import java.util.List;

public class Outcome {

	public OutcomeStatusType status;
	public List<String> resultData;
	
	public Outcome (OutcomeStatusType status) {
		this.status = status;
		resultData = new ArrayList<String>();
	}
	
	protected void setStatus(OutcomeStatusType status) {
		this.status = status;
	}
	public OutcomeStatusType getStatus() {
		return status;
	}

	public List<String> getResultData() {
		return resultData;
	}

	public void setResultData(List<String> resultData) {
		this.resultData = resultData;
	}
	
	/* Easy access */
	public boolean isSuccess() {
		return this.status == OutcomeStatusType.SUCCESS;
	}
	public boolean isFailure() {
		return this.status == OutcomeStatusType.FAILURE;
	}
	public boolean isException() {
		return this.status == OutcomeStatusType.EXCEPTION;
	}
}
