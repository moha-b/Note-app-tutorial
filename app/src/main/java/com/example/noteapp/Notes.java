package com.example.noteapp;


public class Notes {
    private String titleNote;
    private String noteContent;

    public Notes(String titleNote, String noteContent) {
        this.titleNote = titleNote;
        this.noteContent = noteContent;
    }

    public String getTitleNote() {
        return titleNote;
    }

    public void setTitleNote(String titleNote) {
        this.titleNote = titleNote;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

}
