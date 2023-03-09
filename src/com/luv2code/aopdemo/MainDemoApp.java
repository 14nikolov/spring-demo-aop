package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {
	
	public static void main(String[] args) {
		
		// read spring configuration java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		// get account bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// get account bean from spring container
		Account theAccount = context.getBean("account", Account.class);
		
		// call the account business method
		theAccountDAO.addAccount();
		
		// call the membership business method
		theMembershipDAO.addSillyMembershipMethodName();
		
		// call the account business method "setName()"
		theAccount.setName("George");
		// call the account business method "getName()"
		// and printing the returned String 
		System.out.println(theAccount.getName());
		
		// close the spring container
		context.close();
		
	}
	
}
