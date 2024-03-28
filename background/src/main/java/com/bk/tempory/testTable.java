package com.bk.tempory;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("test_table")
public class testTable {
    long id;
    @TableField("username")
    String username;
    String password;

    @TableField(exist = false)
    String notEx;
    public testTable(){}
    public testTable(long id, String username, String password){
        this.id=id;
        this.username=username;
        this.password=password;
    }
}