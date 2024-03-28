package com.bk.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class course {
    String course_code;
    String teacher;
    String courseName;
    String subjectType;

    public course(String course_code, String teacher, String courseName, String subjectType) {
        this.course_code = course_code;
        this.teacher = teacher;
        this.courseName = courseName;
        this.subjectType = subjectType;
    }
}
