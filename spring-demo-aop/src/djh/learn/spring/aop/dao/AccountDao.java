package djh.learn.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

	public void addAccount() {
		System.out.println("Addin g the account to entry");
	}
	
	public void addAccountForForiegoner() {
		System.out.println("Adding the account to addAccountForForiegoner");
	}
}
