package com.rakuten.spring.bean;

//This is GreetingBean.
//The object of this class is going to created by the spring container
public class GreetingBean {
	private String msg;
	
	//setter will be called by the spring container ..
	//setter injection 
public void setMsg(String msg) {
	System.out.println("setter method ...");
		this.msg = msg;
	}
public GreetingBean() {
	System.out.println("Greeting bean instantiated ..");
}
public String sayHello(String name) {
	return "Hi "+name+"\t"+msg;
}
}