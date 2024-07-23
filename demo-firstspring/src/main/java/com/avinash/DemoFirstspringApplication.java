package com.avinash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoFirstspringApplication implements CommandLineRunner{
@Autowired
 @Qualifier("currentAccount")
Account a1;

@Autowired
@Qualifier("savingAccount")
Account a2;
	public static void main(String[] args) {
		SpringApplication.run(DemoFirstspringApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
	a1.viewAccount();
	a2.viewAccount();
		
	}

}
