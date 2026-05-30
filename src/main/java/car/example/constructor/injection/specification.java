package car.example.constructor.injection;

public class specification {
    private String make;
    private String model;
    public void setMake(String make){
        this.make=make;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public String toString(){
        return "Specification{"+make +","+model+"}";
    }
}
