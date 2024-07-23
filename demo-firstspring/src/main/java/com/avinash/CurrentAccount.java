package com.avinash;

import org.springframework.stereotype.Service;

@Service

public class CurrentAccount implements Account{
	public void viewAccount()
	{
		System.out.println("This is CurrentAccount");
	}
	
}
