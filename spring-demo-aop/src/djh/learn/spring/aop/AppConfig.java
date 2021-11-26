package djh.learn.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import djh.learn.spring.aop.dao.AccountDao;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("djh.learn")
public class AppConfig {
	
}
