package com.course.utils;

import com.course.dao.daoimpl.CourseDaoImpl;
import com.course.domian.Course;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.util.List;

/**
*   Excel导出工具类
*   @author albert
*   @date 2019/4/21
*
*/
public final class ExcelHelper {
    public static Workbook export(boolean isXlsx) {
        Workbook workbook;
        if (isXlsx) {
            workbook = new XSSFWorkbook();
        } else {
            workbook = new HSSFWorkbook();
        }
        Sheet sheet = workbook.createSheet("courses");
        List<Course> courses = CourseDaoImpl.getCourseTable();
        for (int i = 0; i < courses.size(); i++) {
            Row row = sheet.createRow(i);
            Course course = courses.get(i);
            row.createCell(0).setCellValue(course.getCourseId());
            row.createCell(1).setCellValue(course.getCourseName());
            row.createCell(2).setCellValue(course.getCourseType());
            row.createCell(3).setCellValue(course.getDescription());
            row.createCell(4).setCellValue(course.getCourseTime());
            row.createCell(5).setCellValue(course.getOperator());

        }
        return workbook;
    }
}
