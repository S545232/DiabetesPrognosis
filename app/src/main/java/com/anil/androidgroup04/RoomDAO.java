package com.anil.androidgroup04;



import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RoomDAO {
    @Insert
    public void Insert(Reminders reminders);

    @Delete
    public void Delete(Reminders reminders);

    @Query("Select * from reminder order by remindDate")
    public List<Reminders> orderThetable();

    @Query("Select * from reminder")
    public List<Reminders> getAll();

}
