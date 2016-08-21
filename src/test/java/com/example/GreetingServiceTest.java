package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingServiceTest
{
	private GreetingService greetingService = new GreetingServiceImpl();
	
	@Test
	public void testGetGreetingOK()
	{
		String greeting = greetingService.getGreeting();
		assertEquals("Wearsafe", greeting);
	}
}
