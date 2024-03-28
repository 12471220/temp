package com.bk.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class timeInformation {
    long id;
    String classAddress;
    String startTime;
    String endTime;
    String date;

    public timeInformation(long id, String classAddress, String startTime, String endTime, String date) {
        this.id = id;
        this.classAddress = classAddress;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
    }
}
