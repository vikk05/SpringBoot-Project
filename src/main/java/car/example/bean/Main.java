package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBean.xml");

        Mybean bean = (Mybean) context.getBean("MyBean"); // the id name in the XML must be provided
        System.out.println(bean);
    }
}
