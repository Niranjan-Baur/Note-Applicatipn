package com.example.noteapplication

import androidx.lifecycle.LiveData

class NoteRepository(private var notesDao: NotesDao) {

    val allNotes : LiveData<List<Note>> = notesDao.getAllNote()

    suspend fun insert(note: Note){
        notesDao.insert(note)
    }

    suspend fun delete(note: Note){
        notesDao.delete(note)
    }

    suspend fun update(note: Note){
        notesDao.update(note)
    }

}