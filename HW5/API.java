package HW5;
import HW5.Room;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
}

