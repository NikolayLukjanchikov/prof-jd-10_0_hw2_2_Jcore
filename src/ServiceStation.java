
public class ServiceStation {

    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        vehicle.checkEngine();
        vehicle.checkTrailer();
    }

    public void check(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Обслуживаем " + vehicles[i].getModelName());
            for (int j = 0; j < vehicles[i].getWheelsCount(); j++) {
                vehicles[i].updateTyre();
            }
            vehicles[i].checkEngine();
            vehicles[i].checkTrailer();
        }
    }
}
