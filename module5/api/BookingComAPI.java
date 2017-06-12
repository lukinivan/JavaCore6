package HomeWork.module5.api;

import HomeWork.module5.room.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI extends APIImpl implements API {

    List<Room> bookingRoomDB = new ArrayList<>();

    public BookingComAPI() {
        allRoms.add(new Room(1144, 17000, 2, new Date(2017, 1, 1), "Urkaina", "Slavutich"));
        allRoms.add(new Room(1203, 15000, 2, new Date(2017, 8, 1), "Befesda", "Cherkasi"));
        allRoms.add(new Room(1074, 11000, 1, new Date(2017, 5, 1), "Kozak", "Podolsk"));
        allRoms.add(new Room(1089, 20000, 3, new Date(2017, 1, 21), "Royal", "Dnepr"));
        allRoms.add(new Room(1000, 12000, 4, new Date(2017, 7, 8), "Bakota", "Odessa"));
    }

    List getDB() {
        return bookingRoomDB;
    }
}
