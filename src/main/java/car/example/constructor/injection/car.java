package car.example.constructor.injection;

public class car {
    private specification specify;

    public car(specification specify) {
        this.specify = specify;
    }

    public void displayDetails(){
        System.out.println("Car Details : "+specify.toString());
    }
}
