package com.bk;

import com.bk.tempory.testTable;
import com.bk.mapper.testMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class testmapper_test {
    @Autowired
    private testMapper tm;

    @Test
    void create(){
        testTable tb=new testTable();
        tb.setId(114514);
        tb.setUsername("monster_senpai");
        tb.setPassword("1919810");
        tm.insert(tb);
    }
    @Test
    void read(){
        List<testTable> lst = tm.selectList(null);
        lst.forEach(System.out::println);
    }
    @Test
    void update(){
        testTable tb=new testTable(114514,"24sai,gaKuSeDesu",null);
        tm.updateById(tb);
    }
    @Test
    void delete(){
        tm.deleteById(114514);
    }
}
