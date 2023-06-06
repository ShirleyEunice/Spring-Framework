package com.wiley.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainPerson {
	public static void main( String[] args )
    {
        ApplicationContext context=
        		new ClassPathXmlApplicationContext("com/wiley/springcore/ci/ciconfig.xml");
        Person pi=(Person)context.getBean("p");
        System.out.println(pi);
    }

}
