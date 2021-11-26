package djh.learn.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

	/*
	 * @Before("execution(public *  djh.learn.spring.aop.dao.AccountDao.addAccount() )"
	 * ) public void beforeAddAccount() {
	 * System.out.println("Calling before the add Account Name......"); }
	 */
	
	
	@Before("execution( *  addAccountString(*) )")
	public void beforeAddAccount() {
		System.out.println("Calling before the add Account Name......");
	}

	/*
	 * @Before("execution(* addAccount*() )") public void afterAddAccount() {
	 * System.out.println("Calling wildcard method the add Account Name......"); }
	 */
}
