package HW5.HW53;
import HW5.HW51.Room;

public interface RoomAPI {
    Room[] findRooms(int price, int persons, String city, String hotel);
}

