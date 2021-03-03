package com.rakuten.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	System.out.println("Initializing Spring Container .....");
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
	System.out.println("Object is Created");
	//at this point object is created if lazy-int is set true
	GreetingBean g1= (GreetingBean) ctx.getBean("g1");
	System.out.println(g1.sayHello("Ashish"));
	
}
}
