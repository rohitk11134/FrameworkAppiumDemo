package outcomes;

public class FailureOutcome extends Outcome{
	private String failureMessage;

	public FailureOutcome(String failureMessage) {
		super(OutcomeStatusType.FAILURE);
		this.setFailureMessage(failureMessage);
	}
	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}
}
