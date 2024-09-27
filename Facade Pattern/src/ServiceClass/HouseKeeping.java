package ServiceClass;

import Interface.HotelService;

public class HouseKeeping implements HotelService {
    String room;

    public void setRoomNumber(String room) {
        this.room = room;
    }

    public void cleanRoom(String roomNumber) {
        System.out.println("Cleaning the room number: " + roomNumber);
    }

    @Override
    public void getService() {
        cleanRoom(room);
    }
}
