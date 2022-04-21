/*package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentTeacherController {
    @Autowired
    private StudentService studentService;
    private TeacherService teacherService;

    @RequestMapping(method = RequestMethod.POST,value = "/studentTeacher")
    public void addStudentTeacher(@RequestBody StudentTeacher student,
                                  @RequestBody StudentTeacher teacher){
        studentService.addStudents(student.getStudentList());
    }

    @RequestMapping(method = RequestMethod.GET,value = "/studentTeachers")
    public List<StudentTeacher> getStudentTeacher(){
      return studentService.getStudentTeacher();
    }
}*/
