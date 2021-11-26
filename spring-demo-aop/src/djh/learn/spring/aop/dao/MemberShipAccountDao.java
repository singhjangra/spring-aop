package djh.learn.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipAccountDao {

	public void addAccount() {
		System.out.println("Adding the account for the MemberDao");
	}
	
	public String addAccountString() {
		return "Adding the account for theaddAccountString  MemberDao";
	}
	
	public String addAccountString(String name) {
		return "Adding the account for theaddAccountString name para MemberDao";
	}
}
