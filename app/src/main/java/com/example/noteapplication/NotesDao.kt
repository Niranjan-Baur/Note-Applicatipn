package com.example.noteapplication

import androidx.lifecycle.LiveData
import androidx.room.*
import java.nio.channels.SelectionKey


@Dao
interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Note)

    @Update
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("Select * from notesTable order by id ASC")

    fun getAllNote() : LiveData<List<Note>>

}