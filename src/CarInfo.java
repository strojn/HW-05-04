public class CarInfo {
    private Car[] carList;
    private int carNumer = 0;

    public CarInfo(Car car) {
        this.carList = new Car[1];
        this.carList[0] = car;
        carNumer = 1;
    }

    public void addCar(Car newCar)
    {
        Car[] newList;
        newList = new Car[carNumer + 1];

        for (int i = 0; i < carNumer; i++) {
            newList[i] = carList[i];
         }

        newList[newList.length - 1] = newCar;
        carList = newList;

        carNumer++;
    }
    public void viewCarList() {

        for (Car i : carList) {
            System.out.println(i.model);
        }
    }

    public void fastest() {
        Car fastestCar = carList[0];
        for (int i = 1; i < carNumer; i++) {
            if (carList[i].speed > fastestCar.speed)
                fastestCar = carList[i];
        }
        System.out.println(" - FASTEST -");
        System.out.println("Brand: " + fastestCar.model);
        System.out.println("Power: " + fastestCar.power);
        System.out.println("Speed: " + fastestCar.speed);
        System.out.println("Price: " + fastestCar.price);
        System.out.println("Year: " + fastestCar.yearOfManufacture);
    }
    public void richest() {
        Car car = carList[0];
        for (int i = 1; i < carNumer; i++) {
            if (carList[i].price > car.price)
                car = carList[i];
        }
        System.out.println(" - RICHEST -");
        System.out.println("Brand: " + car.model);
        System.out.println("Power: " + car.power);
        System.out.println("Speed: " + car.speed);
        System.out.println("Price: " + car.price);
        System.out.println("Year: " + car.yearOfManufacture);
    }
    public void powerest() {
        Car car = carList[0];
        for (int i = 1; i < carNumer; i++) {
            if (carList[i].power > car.power)
                car = carList[i];
        }
        System.out.println(" - POWEREST -");
        System.out.println("Brand: " + car.model);
        System.out.println("Power: " + car.power);
        System.out.println("Speed: " + car.speed);
        System.out.println("Price: " + car.price);
        System.out.println("Year: " + car.yearOfManufacture);
    }
}
