package com.bk.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class examInformation {
    String classAddress;
    String classCapacity; //校区

    public examInformation(String classAddress, String classCapacity) {
        this.classAddress = classAddress;
        this.classCapacity = classCapacity;
    }
}
