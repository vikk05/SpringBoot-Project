package car.example.autowiringByName;

public class specification {
    private String make;
    private String model;
    public void setMake(String make){
        System.out.println("Setter1 is called");
        this.make=make;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String model){
        System.out.println("Setter2 is called");
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public String toString(){
        System.out.println("Finally tostring is called");
        return "Specification{"+make +","+model+"}";
    }
}
