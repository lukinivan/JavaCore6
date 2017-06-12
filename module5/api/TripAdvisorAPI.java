package HomeWork.module5.api;

import HomeWork.module5.room.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI extends APIImpl implements API {
    List<Room> tripAdvisorRoomDB = new ArrayList<>();


    public TripAdvisorAPI() {
        allRoms.add(new Room(2144, 17000, 2, new Date(2017, 1, 1), "Urkaina", "Kiev"));
        allRoms.add(new Room(3074, 11000, 1, new Date(2017, 1, 1), "Kozak", "Kharkov"));
        allRoms.add(new Room(3089, 20000, 3, new Date(2017, 1, 1), "Royal", "Dnepr"));
        allRoms.add(new Room(4000, 12000, 4, new Date(2017, 1, 1), "Bakota", "Odessa"));
        allRoms.add(new Room(3203, 15000, 2, new Date(2017, 1, 1), "Befesda", "Lviv"));
    }

    List getDB(){
        return tripAdvisorRoomDB;
    }
}
