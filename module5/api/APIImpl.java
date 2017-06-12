package HomeWork.module5.api;

import HomeWork.module5.room.Room;

import java.util.ArrayList;
import java.util.List;

public class APIImpl implements API {
    List<Room> allRoms = new ArrayList<>();

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> resultedRooms = new ArrayList<>();
        Room room = new Room();

        room.setPrice(price);
        room.setPersons(persons);
        room.setCityName(city);
        room.setHotelName(hotel);

        for (Room allRom : allRoms) {
            if (allRom.equals(room)){
                resultedRooms.add(allRom);
            }
        }

        return resultedRooms.toArray(new Room[resultedRooms.size()]);
    }

    @Override
    public Room[] getAllRooms() {
        return allRoms.toArray(new Room[allRoms.size()]);
    }


}
