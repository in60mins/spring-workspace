package com.in30minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class LaptopDealarApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LaptopDealarApplication.class, args);

		ApplicationContext context= new ClassPathXmlApplicationContext("applicationcontext.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the brand you wanna buy:\n1. Dell\n2. Macbook\n3. Microsoft");
		int userBrandSelected = scanner.nextInt();

		System.out.println("Choose the processer you want:\n1. i3\n2. i5\n3. i7");
		int userProcesserSelected = scanner.nextInt();

		String beanId="";

		switch (userBrandSelected){
			case 1:{
				switch (userProcesserSelected){
					case 1:{
						beanId="delli3";
						break;
					}
					case 2:{
						beanId="delli5";
						break;
					}
					case 3:{
						beanId="delli7";
						break;
					}
				}
				break;
			}
			case 2:{
				switch (userProcesserSelected){
					case 1:{
						beanId="maci3";
						break;
					}
					case 2:{
						beanId="maci5";
						break;
					}
					case 3:{
						beanId="maci7";
						break;
					}
				}
				break;
			}
			case 3:{
				switch (userProcesserSelected){
					case 1:{
						beanId="microsofti3";
						break;
					}
					case 2:{
						beanId="microsofti5";
						break;
					}
					case 3:{
						beanId="microsofti7";
						break;
					}
				}
				break;
			}
		}

		Brand brand = (Brand) context.getBean(beanId);
		brand.showDetailes();
	}

}
