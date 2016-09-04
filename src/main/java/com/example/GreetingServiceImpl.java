package com.example;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService
{
	@Override
	public String getGreeting()
	{
		return "CI Test";
	}
}
