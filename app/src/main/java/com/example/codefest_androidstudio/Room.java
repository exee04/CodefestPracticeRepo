package com.example.codefest_androidstudio;

public class Room {
    private String room_number, room_type;

    public Room(String room_number, String room_type) {
        this.room_number = room_number;
        this.room_type = room_type;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }
    public String getRoom_number() {
        return room_number;
    }

    public String getRoom_type() {
        return room_type;
    }
    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }
}
