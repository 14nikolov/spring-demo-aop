package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advises for logging
	// lets start with an @Before advice
	

//	Example 1:
//	this @Before Advice will execute every time before
//	calls are made to all methods named addAccount()
//  the methods need to have a modifier that is "public" and a return type of "void"
//	@Before("execution(public void addAccount())")
//	public void beforeAddAccountAdvice() {
//		
//		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
//		
//	}
	
	
//	Example 2:
//	this @Before Advice will execute every time before the method 
//	addAccount() from the AccountDAO class is called
//  the method needs to have a modifier that is "public" and a return type of "void"
//	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
//	public void beforeAddAccountAdvice() {
//		
//		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
//		
//	}
	
	
//	Example 3:
//	this @Before Advice will execute every time before
//	calls are made to all methods, whose name starts with "add"
//  the methods need to have a modifier that is "public" and a return type of "void"
//	examples of such methods: addAccount, addMoney, addGiantSnake, addLoremIpsumLorem
//	@Before("execution(public void add*())")
//	public void beforeAddAccountAdvice() {
//		
//		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
//		
//	}
	
	
//	Example 4:
//  this @Before Advice will execute every time before
//  calls are made to all methods, whose name starts with "add"
//  the methods can have any modifier or return type
	@Before("execution(* add*())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
	}
	
//	Example 4:
//	this @Before Advice will execute before all methods
//	from the class "Account", from the package "com.luv2code.aopdemo"
	@Before("execution(* com.luv2code.aopdemo.Account.*(..))")
	public void beforeAnyMethodOfThatPackageAdvice() {
		System.out.println("\n=====>>> Executing @Before advice, that applies only to methods from the class \"Account\" from the package \"com.luv2code.aopdemo\"");
	}
	
}







