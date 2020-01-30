package com.xworkz.fuel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fuel.app.Labour;


public class ThreadTester {
	public static void main(String[] args) {
		try {
			String xmlpath="context.xml";
			ApplicationContext spring = new ClassPathXmlApplicationContext(xmlpath );
			Labour labour=spring.getBean(Labour.class);
			
			labour.work();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	}


