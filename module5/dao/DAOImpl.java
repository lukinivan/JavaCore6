package HomeWork.module5.dao;

import HomeWork.module5.room.Room;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {

    private final List<Room> roomDB = new ArrayList<>();

    @Override
    public Room save(Room room) {
        roomDB.add(room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        for (int i = 0; i < roomDB.size(); i++) {
            if (roomDB.get(i) != null && room.equals(roomDB.get(i))) {
                roomDB.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Room update(Room room) {
        Room answer = null;
        int index = roomDB.indexOf(room);
        if (index != -1) {
            answer = roomDB.set(index, room);
        }
        return answer;
    }

    @Override
    public Room findById(long id) {
        for (Room room : roomDB) {
            if (id == room.getId()) {
                return room;
            }
        }
        return null;
    }

}
