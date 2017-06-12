package HomeWork.module5;

import HomeWork.module5.api.API;
import HomeWork.module5.room.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    List<API> apis = new ArrayList<>();

    public Controller(List<API> apis) {
        this.apis = apis;
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        List<Room> roomsList = new ArrayList<>();

        for (API apiImpl : apis){
            Room[] roomsArrFromApiImpl = apiImpl.findRooms(price, persons, city, hotel);
            if (roomsArrFromApiImpl.length != 0) {
                roomsList.addAll(Arrays.asList(roomsArrFromApiImpl));
            }
        }

        return roomsList.toArray(new Room[roomsList.size()]);
    }

    Room[] check(API api1, API api2) {
        List<Room> roomsList = new ArrayList<>();
        Room[] roomsAPI1 = api1.getAllRooms();
        Room[] roomsAPI2 = api2.getAllRooms();

        for (Room roomAPI1 : roomsAPI1) {
            for (Room roomAPI2 : roomsAPI2) {
                if (roomAPI1.equals(roomAPI2)){
                    roomsList.add(roomAPI1);
                }
            }
        }

        return roomsList.toArray(new Room[roomsList.size()]);
    }

}
