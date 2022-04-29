package com.socialmedia.socialmedia;

import com.socialmedia.socialmedia.Student.Student;
import com.socialmedia.socialmedia.Teacher.Teacher;

public class StudentTeacher  {
    private Student[] studentList;
    private Teacher[] teacherList;

    public StudentTeacher(){}

    public StudentTeacher(Student[] studentList,Teacher[] teacherList) {
        this.studentList=studentList;
        this.teacherList=teacherList;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public Teacher[] getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(Teacher[] teacherList) {
        this.teacherList = teacherList;
    }
}
