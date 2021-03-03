package com.rakuten.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	System.out.println("Initializing Spring Container .....");
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
	
}
}
