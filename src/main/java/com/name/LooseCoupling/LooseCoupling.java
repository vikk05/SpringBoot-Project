package com.name.LooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ObjectInputFilter;

public class LooseCoupling {
    public static void main(String[] args){
        //IoC (Inversion of Control) is a principle where the
        // control of creating and managing objects is given to the
        // Spring container instead of the programmer.
        // DI (Dependency Injection) is a technique used by Spring to implement IoC and achieve loose coupling.

        ApplicationContext context = new ClassPathXmlApplicationContext("LooseCouplingIOCbean.xml");

        UserManager userManagerWithDB =(UserManager) context.getBean("userDatabaseWithUserManager");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWITHWebService = (UserManager) context.getBean("webServiceDataWithUserManager");
        System.out.println(userManagerWITHWebService.getUserInfo());

        UserManager userManagerWITHNewDatabase = (UserManager) context.getBean("newDatabaseWithUserManager");
        System.out.println(userManagerWITHNewDatabase.getUserInfo());



    }
}
