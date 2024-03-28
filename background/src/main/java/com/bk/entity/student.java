package com.bk.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@TableName("student")
@Getter
@Setter
public class student {
    String studentId; //the key
    String stuName;
    String subject;
    String teacher;
    String courseCode;
    String subjectType;
    int campus;//校区

    public student(String studentId, String stuName, String subject, String teacher, String courseCode, String subjectType, int campus) {
        this.studentId = studentId;
        this.stuName = stuName;
        this.subject = subject;
        this.teacher = teacher;
        this.courseCode = courseCode;
        this.subjectType = subjectType;
        this.campus = campus;
    }
}
