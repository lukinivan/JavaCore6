package HomeWork.module5.dao;

import HomeWork.module5.room.Room;

public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
