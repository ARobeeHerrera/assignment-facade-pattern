package ServiceClass;

import Interface.HotelService;

public class HouseKeeping implements HotelService {
    String roomNumber;
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom() {
        System.out.println("Cleaning the room number: " + roomNumber);
    }

    @Override
    public void getService() {
        cleanRoom();
    }
}
