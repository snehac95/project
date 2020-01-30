package com.xworkz.fuel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fuel.app.Rocket;

public class Tester {
	public static void main(String[] args) {
	
			try {
				String xmlpath="context.xml";
				ApplicationContext spring = new ClassPathXmlApplicationContext(xmlpath );
				Rocket ref=spring.getBean(Rocket.class);
				ref.launch();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
