package car.example.AutowireByType;

public class car {
    private specification specification;


    public void setSpecify(specification specify) {
        this.specification = specify;
    }

    public void displayDetails(){
        System.out.println("Car Details : "+specification.toString());
    }
}
