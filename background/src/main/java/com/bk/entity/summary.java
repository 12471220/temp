package com.bk.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class summary {
    long id;
    String teacher;
    String stuId;
    String stuName;
    String ticketNumber;
    String courseCode;
    String startTime;
    String endTime;
    String classAddress;
    String subject;
    String date;
    String batchNumber;

    public summary(long id, String teacher, String stuId, String stuName, String ticketNumber, String courseCode, String startTime, String endTime, String classAddress, String subject, String date, String batchNumber) {
        this.id = id;
        this.teacher = teacher;
        this.stuId = stuId;
        this.stuName = stuName;
        this.ticketNumber = ticketNumber;
        this.courseCode = courseCode;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classAddress = classAddress;
        this.subject = subject;
        this.date = date;
        this.batchNumber = batchNumber;
    }
}
