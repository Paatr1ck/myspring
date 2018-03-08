package com.shsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.demo.HelloSpring;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-context.xml");		
		 HelloSpring hs = (HelloSpring)act.getBean("helloSpring");
		 hs.print();
	}

}
