package com.socialmedia.socialmedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.POST,value = "/student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/student_ids")
    public  List<Student> addStudentIdRequest(@RequestBody StudentIdRequest student_ids){
       return studentService.addStudentIdRequest(student_ids.getIds());
    }

    @RequestMapping(method = RequestMethod.POST,value = "/cusStudent_ids")
    public List<CustomStudent> addCusStudent(@RequestBody StudentIdRequest student_ids){
        return studentService.addCusStudent(student_ids.getIds());
    }

    @RequestMapping(method = RequestMethod.GET,value = "/student")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/student/{student_id}")
    public Student getStudent(@PathVariable ("student_id")String student_id){
        return studentService.getStudent(student_id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/student/{student_id}")
    public Student updateStudent(@RequestBody Student student,@PathVariable("student_id")String student_id){
        return studentService.updateStudent(student,student_id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/student/{student_id}")
    public void deleteStudent(@PathVariable("student_id")String student_id){
        studentService.deleteStudent(student_id);
    }
}
