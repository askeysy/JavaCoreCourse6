package HW5;

import HW5.Room;
import HW5.RoomAPI;

private Room[] rooms;

public class BookingComAPI implements RoomAPI{
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}

class TripAdvisorAPI implements RoomAPI{
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}

class GoogleAPI implements RoomAPI{
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}