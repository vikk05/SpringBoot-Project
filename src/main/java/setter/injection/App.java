package setter.injection;

import car.example.constructor.injection.car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext("specificationGetterBean.xml");
        Car mycar = (Car) context.getBean("myCar");
        mycar.displayDetails();
    }
}
