public class Car {
    public String model;// - назва машини
    public double power;// - від 0.0 до 200.0
    public int speed;// - від 0 до 320
    public Car(String model, double power, int speed, double price) {
        this.model = model;

        if (power < 0)
            this.power = 0;
        else if (power > 200)
            this.power = 200;
        else
            this.power = power;

        if (speed < 0)
            this.speed = 0;
        else if (speed > 320)
            this.speed = 320;
        else
            this.speed = speed;

        if (price < 0)
            this.price = 0;
        else if (price > 50000)
            this.price = 50000;
        else
            this.price = price;
    }
    public double price;// - від 0.0 до 50000.0
    public final int yearOfManufacture  = 1967;//  для всіх один рік i оголошується лише один раз
}
