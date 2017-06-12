package HomeWork.module5.api;

import HomeWork.module5.room.Room;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAllRooms();
}
