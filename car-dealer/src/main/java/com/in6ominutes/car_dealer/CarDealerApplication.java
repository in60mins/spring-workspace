package com.in6ominutes.car_dealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.Scanner;

//@SpringBootApplication
public class CarDealerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CarDealerApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the car you wanna buy:-\n1. Family Car\n2. Sports Car\n3. Cyber Tuck");
		int userSelect = scanner.nextInt();
		String beanId = "";
		switch (userSelect){
			case 1:beanId = "family";
			break;
			case 2: beanId = "sports";
			break;
			case 3: beanId = "cyberTruck";
			break;
		}
		Car car = (Car) context.getBean(beanId);
		car.selectedCar();
	}

}
