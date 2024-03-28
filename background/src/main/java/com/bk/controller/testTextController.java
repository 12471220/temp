package com.bk.controller;

import com.bk.entity.student;
import com.bk.tools.excelTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class testTextController {
    @Value("${sav.root}")
    String savPath;
    @Autowired
    excelTool et;


    @GetMapping("/tt1")
    String tt1(){
        return "hello world";
    }

    @PostMapping("/tt2")
    String tt2(){
        System.out.println("web uploaded a file.");
        return "<html>" +
                "<body>" +
                "<h1>" +
                "DONE!"+
                "</h1>"+
                "</body>"+
                "</html>";
    }
    @PostMapping("/tt3")
    String savFile(@RequestParam MultipartFile file){
        if(file.isEmpty()){
            System.out.println("err");
            return "empty";
        }
        String fileName=file.getOriginalFilename();
        File f=new File(savPath+fileName);
        System.out.println(savPath+f.getName());
        try {
            file.transferTo(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "yes hello.";
    }
    @GetMapping ("/tt4")
    List<student> read(){
        String f="import1.xlsx";
        String res="";
        et.setFile(f);
        ArrayList<student> students = et.readData();
        return students;
    }

}
