package liquibase.ext.ucd.rice;

import liquibase.change.AbstractChange;
import liquibase.change.DatabaseChangeProperty;

public abstract class KimChangeBase extends AbstractChange {

	protected String applicationId;

	@DatabaseChangeProperty(description="Application which owns the new KIM data", exampleValue="KFS")
	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
}
