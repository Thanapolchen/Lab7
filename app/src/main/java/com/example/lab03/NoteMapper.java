package com.example.lab03;

import com.google.gson.Gson;

public class NoteMapper {

    static Gson gson = new Gson();

    // OOP -> Entity
    public static NoteEntity toEntity(Note note) {
        if (note instanceof TextNote) {
            return new NoteEntity(note.title, "text", null, ((TextNote) note).getTextContent(), note.dateCreated);
        }
        /*else if (note instanceof ChecklistNote) {
            String jsonItems = gson.toJson(((ChecklistNote) note).getItems());
            return new NoteEntity(note.title, "checklist", jsonItems, null, note.dateCreated);
        }*/
        return null;
    }

    // Entity -> OOP
    public static Note fromEntity(NoteEntity entity) {
        if (entity.type.equals("text")) {
            return new TextNote();
        }
        /*else if (entity.type.equals("checklist")) {
            List<String> items = gson.fromJson(entity.checklistItemsJson, new TypeToken<List<String>>(){}.getType());
            return new ChecklistNote(entity.title, entity.dateCreated, items);
        }*/
        return null;
    }
}