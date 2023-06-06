package com.wiley.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCMain {
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
        AbstractApplicationContext context=
        		new ClassPathXmlApplicationContext("com/wiley/springcore/lifecycle/pizzaconfig.xml");
        Pizza pz=(Pizza)context.getBean("pizza1");
    
        System.out.println(pz);
        
        context.registerShutdownHook();
    }

}
