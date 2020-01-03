package com.example.singhkshitiz.letschat;

/**
 * Created by LAURI on 16/12/2019.
 * ----FOR RETRIEVING "chats" SECTION OF DATABASE-----
 */

public class Conv {
    public boolean seen;
    public long timeStamp;

    public Conv(){

    }

    public Conv(boolean seen, long timeStamp) {
        this.seen = seen;
        this.timeStamp = timeStamp;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
