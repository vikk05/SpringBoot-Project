package car.example.setter.injection;

public class specificationn {
    private String make;
    private String model;
    private int model_id;

    public void setMake(String make){
        this.make=make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setModel_id(int model_id){
        this.model_id=model_id;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getModel_id(){
        return model_id;
    }
    public String toString(){
        return "Specification{"+make+" ,"+model+", "+model_id +"}";
    }

}
