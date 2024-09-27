package ServiceClass;

import Interface.HotelService;

public class Valet implements HotelService {
    String plate;

    public void setPlateNumber(String plate) {
        this.plate = plate;
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picking up vehicle with the following plate number: " + plateNumber);
    }

    @Override
    public void getService() {
        pickUpVehicle(plate);
    }
}
