package car.example.ComponentScanAnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Employee {
        @Value("05")
        private int empId;
        @Value("Vivek")
        private String firstname;
        @Value("Chauhan")
        private String lastname;
        @Value("#{1000*100}")
        private double salary;
        /*public Employee(){
            firstname="Vivek";
            lastname="Chauhan";
            salary=100000;
            empId=05;
        }

         */
        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public String toString(){
            return  "Employee [empId=" + empId + ", firstname=" + firstname+", lastname=" + lastname+", salary=" + salary + "]";
        }
}


