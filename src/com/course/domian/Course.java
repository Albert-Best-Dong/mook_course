package com.course.domian;

public class Course {
    private String courseId;
    private String courseName;
    private String courseType;
    private String description;
    private String courseTime;
    private String operator;

    public Course() {
    }

    public Course(String courseId, String courseName, String courseType, String description, String courseTime, String operator) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseType = courseType;
        this.description = description;
        this.courseTime = courseTime;
        this.operator = operator;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", description='" + description + '\'' +
                ", courseTime='" + courseTime + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
