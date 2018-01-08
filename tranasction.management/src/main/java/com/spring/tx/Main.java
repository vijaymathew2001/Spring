package com.spring.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tx.model.User;
import com.spring.tx.test.OuterBean;

public class Main 
{
	  public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	OuterBean testBean = (OuterBean) ctx.getBean("outerBeanImpl");
    	
    	User user = new User();
    	user.setUsername("vijaymathew");
    	
    	try{
    		testBean.testRequired(user);
    	} catch(Exception e){
    		System.out.println();
    		// catch exception raised from transaction rollback
    	}
    	
    	//testBean.testRequiresNew(user);
    	
    }
}
