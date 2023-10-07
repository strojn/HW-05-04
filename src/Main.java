public class Main {
    public static void main(String[] args) {

        Car ford = new Car("FORD Mustang", 175, 250, 13800);
        Car mitsubishi = new Car("MITSUBISHI Lancer", 120, 190, 17000);
        Car toyota = new Car("TOYOTA Camry", 145, 200, 25000);
        Car kia = new Car("KIA Rio", 125, 185, 15000);

        CarInfo carInfo = new CarInfo(ford);
        carInfo.addCar(mitsubishi);
        carInfo.addCar(toyota);
        carInfo.addCar(kia);

//        carInfo.viewCarList();
        carInfo.fastest();
        carInfo.richest();
        carInfo.powerest();
    }
}