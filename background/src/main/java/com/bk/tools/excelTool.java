package com.bk.tools;

import com.bk.entity.student;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Component
public class excelTool {
    @Value("${sav.root}")
    String root;
    XSSFWorkbook xb;
    ArrayList<student> students=new ArrayList<>();
    public excelTool(){}

    public ArrayList<student> readData(){

        // 获取第一个工作表
        XSSFSheet sheet = xb.getSheetAt(0);
        // bian li this row.
        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
            XSSFRow row = sheet.getRow(rowNum);
            // sav this row
            ArrayList<String> thisCol=new ArrayList<>();

            for(int col=0;col<row.getLastCellNum();col++){
                XSSFCell c = row.getCell(col);
                thisCol.add(String.valueOf(c));
                System.out.println(c);
            }

            student stu=new student(
                    thisCol.get(0),
                    thisCol.get(1),
                    thisCol.get(2),
                    thisCol.get(3),
                    thisCol.get(4),
                    thisCol.get(5),
                    Integer.parseInt(thisCol.get(6).substring(0, thisCol.get(6).indexOf('.')))
            );
            students.add(stu);
        }
        return students;
    }

    public void setFile(String fn){
        FileInputStream fis;
        try {
            System.out.println(root+fn);
            fis=new FileInputStream(root+fn);
            xb=new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
