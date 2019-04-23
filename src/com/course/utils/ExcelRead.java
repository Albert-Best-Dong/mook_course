package com.course.utils;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*   文本工具类： 文本工具类：
*   @author albert
*   @date 2019/4/21
*
*/
public class ExcelRead {

    public static ArrayList readFile(HttpServletRequest request){

        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
        Workbook workbook = null;
        upload.setHeaderEncoding("UTF-8");
        //解析上传的文件
        try {
            List<FileItem> fileItemList = upload.parseRequest(request);
            for (FileItem fileItem : fileItemList) {

                workbook = WorkbookFactory.create(fileItem.getInputStream());
                Sheet sheet = workbook.getSheetAt(0);
                int rowNum = sheet.getLastRowNum();

                for (int i = 0; i <= rowNum ; i++) {
                    ArrayList<String> courseString =new ArrayList<String>();
                    Row row = sheet.getRow(i);
                    courseString.add(String.valueOf(row.getCell(0).getNumericCellValue()));
                    courseString.add(row.getCell(1).getStringCellValue());
                    courseString.add(row.getCell(2).getStringCellValue());
                    courseString.add(row.getCell(3).getStringCellValue());
                    courseString.add(String.valueOf(row.getCell(4).getNumericCellValue()));
                    courseString.add(row.getCell(5).getStringCellValue());
                    result.add(courseString);
                }

            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
