package car.example.autowiringByName;

public class car {
    private specification specify;


    public void setSpecify(specification specify) {
        this.specify = specify;
    }

    public void displayDetails(){
        System.out.println("Car Details : "+specify.toString());
    }
}
