
public class Main {
    public static void main(String[] args) {
        Car.setCountCars(2);
        Car[] car = new Car[Car.getCountCars()];
        for(int i = 0; i < Car.getCountCars(); i++) {
            car[i] = new Car();
        }

        for(int i = 0; i < Car.getCountCars(); i++) {
            car[i].print();
            System.out.println("");
        }

        Car car1 = new Car();
        car1.FileWriteCarName();
        car1.FileReadCarName();
        car1.setModel("Model2");
        car1.FileWriteCarName();
        car1.FileReadCarName();
    }
}