package car.example.bean;

public class Mybean {
    public String message;

    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println(message);
    }
    @Override
    public String toString(){
        return "Mybean{"+"message="+message+"}";
    }

}
