package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=
        		new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        
        Student std=(Student)context.getBean("std");
        System.out.println(std);
        
        Student std1=(Student)context.getBean("std1");
        System.out.println(std1);
        
        Student std2=(Student)context.getBean("std2");
        System.out.println(std2);
    }
}
