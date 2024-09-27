package ServiceClass;

import Interface.HotelService;

public class HouseKeeping implements HotelService {
    private String room;

    public void setRoom(String room) {
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
