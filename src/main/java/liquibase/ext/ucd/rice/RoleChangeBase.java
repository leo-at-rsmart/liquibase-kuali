package liquibase.ext.ucd.rice;

import liquibase.change.AbstractSQLChange;
import liquibase.change.DatabaseChangeProperty;

public abstract class RoleChangeBase extends AbstractSQLChange {

	protected String roleNamespaceCode;
	protected String roleName;

	@DatabaseChangeProperty(description="Namespace code for the role to be modified", exampleValue="KFS-SYS")
	public String getRoleNamespaceCode() {
		return roleNamespaceCode;
	}

	public void setRoleNamespaceCode(String roleNamespaceCode) {
		this.roleNamespaceCode = roleNamespaceCode;
	}

	@DatabaseChangeProperty(description="Name of the role to be modified", exampleValue="Chart Manager")
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
