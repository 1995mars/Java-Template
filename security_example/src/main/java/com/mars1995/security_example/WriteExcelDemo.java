package com.mars1995.security_example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WriteExcelDemo
{
    public static void main(String[] args)
    {
        //Blank workbook
//        XSSFWorkbook workbook = new XSSFWorkbook();

        // Sử dụng XSSF Streaming Workbook: Thay vì sử dụng XSSFWorkbook (trong Apache POI), bạn có thể sử dụng XSSF Streaming Workbook.
        // XSSF Streaming Workbook cho phép ghi dữ liệu một cách tối ưu thông qua việc sử dụng streaming và bộ đệm nhỏ hơn.
//        SXSSFWorkbook workbook = new SXSSFWorkbook();
//        Sử dụng Memory-Optimized Write Mode: Với SXSSFWorkbook, bạn có thể sử dụng chế độ ghi tối ưu hóa bộ nhớ (memory-optimized write mode)
//        để giảm bộ nhớ sử dụng trong quá trình ghi dữ liệu.
//        Điều này có thể giúp tăng tốc độ ghi dữ liệu.
        SXSSFWorkbook workbook = new SXSSFWorkbook(null, 1000);

        //Create a blank sheet
        //XSSFSheet sheet = workbook.createSheet("Employee Data");
        Sheet sheet = workbook.createSheet("Employee Data");

        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        long startTime = System.currentTimeMillis();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (int i = 0; i < 300000; i++)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get("1");
            int cellnum = 0;
            for (Object obj : objArr)
            {
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            //Write the workbook in file system
//            FileOutputStream bufferedOut = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));
            FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));
            BufferedOutputStream bufferedOut = new BufferedOutputStream(out);
            workbook.write(bufferedOut);
            bufferedOut.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}

