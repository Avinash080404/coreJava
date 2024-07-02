package com.avinash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoFirstspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFirstspringApplication.class, args);
		Student s1=new Student(1,"Avinash","avi@gmail.com","34378268");
		System.out.println(s1.getRoll()+" "+s1.getName()+" "+s1.getMail()+" "+s1.getMobileno());
		System.out.println("Hello SpringBoot!");
	}

}
