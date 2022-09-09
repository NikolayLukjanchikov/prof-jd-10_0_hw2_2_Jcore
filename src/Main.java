public class Main {
    public static void main(String[] args) {
        System.out.println("2.2 ООП");

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Vehicle[] garage = new Vehicle[]{car, car2, truck, truck2, bicycle, bicycle2};

        ServiceStation station = new ServiceStation();
        station.check(car2);
        station.check(bicycle);
        station.check(truck2);
        System.out.println();
        System.out.println("Обслуживаем весь гараж сразу: ");

        station.check(garage);
    }
}