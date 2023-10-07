public class Car {
    public String model;// - назва машини
    public double power;// - від 0.0 до 200.0
    public int speed;// - від 0 до 320
    public Car(String model, double power, int speed, double price) {
        this.model = model;
        this.power = power;
        this.speed = speed;
        this.price = price;
    }
    public double price;// - від 0.0 до 50000.0
    public final int yearOfManufacture  = 1967;//  для всіх один рік i оголошується лише один раз
}
