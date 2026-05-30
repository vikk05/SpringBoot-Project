package car.example.AutowireByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoWireByType.xml");
        car myCar = (car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
