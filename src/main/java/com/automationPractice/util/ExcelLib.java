package com.automationPractice.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.automationPractice.base.TestBase;


public class ExcelLib  {
    XSSFWorkbook wb;
    XSSFSheet sheet;

    public ExcelLib(String fileName) {
        try {
            File src = new File(fileName);
            FileInputStream file = new FileInputStream(src);
            wb = new XSSFWorkbook(file);

        }

        catch (Exception e) {
            e.getMessage();
        }
    }

    public String getData(int SheetName, int row, int column) {

        sheet = wb.getSheetAt(SheetName);
        String data1 = sheet.getRow(row).getCell(column).getStringCellValue();
//        System.out.println(data1);

        return data1;

    }

    public int getRowCont(int index) {
        int i = wb.getSheetAt(index).getLastRowNum();

        return i;
    }
    public int getData1(int SheetNum, int row,String value) {
    	int a=0;
        sheet = wb.getSheetAt(SheetNum);
        int noOfColumns = sheet.getRow(0).getLastCellNum();
        //System.out.println(noOfColumns);
        String[] Headers = new String[noOfColumns];
        for (int j=0;j<noOfColumns;j++){
            Headers[j] = sheet.getRow(0).getCell(j).getStringCellValue();
        }
            for (a=0;a<noOfColumns;a++){
                if(Headers[a].equals(value)){
                	break;
                	
                    }
       

        
    }
			return a;
            
    }
}
