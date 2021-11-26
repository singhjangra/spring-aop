package djh.learn.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import djh.learn.spring.aop.dao.AccountDao;
import djh.learn.spring.aop.dao.MemberShipAccountDao;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AccountDao dao = context.getBean("accountDao",AccountDao.class);
		MemberShipAccountDao mdao = context.getBean("memberShipAccountDao",MemberShipAccountDao.class);
		//dao.addAccount();
		
		String xyz = mdao.addAccountString("dgh");
		System.out.println(xyz);
		
 
	}
} 
