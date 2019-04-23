package com.course.service.serviceimpl;

import com.course.dao.CourseDao;
import com.course.dao.daoimpl.CourseDaoImpl;
import com.course.domian.Course;
import com.course.service.CourseService;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 课程Service实现类
 *
 * @author albert
 * @date 2019/4/20
 */
public class CourseServiceImpl implements CourseService {
    private CourseDao cd = new CourseDaoImpl();     //CourseDao对象，用于调用方法的返回值


    public CourseServiceImpl() {
    }

    public CourseServiceImpl(CourseDao cd) {
        this.cd = cd;
    }

    @Override
    //用户登录
    public int login(String username, String password) {

        return cd.login(username, password);
    }

    @Override
    public void addUser(String username, String password) {
        cd.addUser(username,password);
    }

    @Override
    public List<Map<String, Object>> getAllUsers() {
        return cd.getAllUsers();
    }

    @Override
    public void delUser(String username) {
        cd.delUser(username);
    }

    @Override
    public void addCourse(Course course) {
        cd.addCourse(course);
    }

    @Override
    public List<Course> getAllCourse() {
        return cd.getAllCourse();
    }

    @Override
    //导入课程
    public void importCourse(ArrayList<ArrayList<String>> courseList) {

        for (ArrayList<String> courseString : courseList) {
            Course course = new Course();
            course.setCourseId(courseString.get(0));
            course.setCourseName(courseString.get(1));
            course.setCourseType(courseString.get(2));
            course.setDescription(courseString.get(3));
            course.setCourseTime(courseString.get(4));
            course.setOperator(courseString.get(5));
            cd.addCourse(course);
            continue;
        }
    }

    @Override
    public void exportCourse(HttpServletResponse response) {

    }
}
