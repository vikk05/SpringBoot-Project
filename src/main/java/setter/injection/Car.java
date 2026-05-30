package setter.injection;

public class Car {
    public specificationn specify;

    public void setSpecify(specificationn specify){
        this.specify=specify;
    }
    public void displayDetails(){
        System.out.println("Car Details "+specify.toString());
    }
}
