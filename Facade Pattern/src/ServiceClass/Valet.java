package ServiceClass;

import Interface.HotelService;

public class Valet implements HotelService {
    String plateNumber;

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle() {
        System.out.println("Picking up vehicle with the following plate number: " + plateNumber);
    }

    @Override
    public void getService() {
        pickUpVehicle();
    }
}
