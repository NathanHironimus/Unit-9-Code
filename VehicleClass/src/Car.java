public class Car extends Vehicle{
    public String make, model;
    public int year;
    public Car(String make, String model, String color, int year){
        super(4, color);
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
