package com.socialmedia.socialmedia.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method = RequestMethod.POST,value = "/student")
    public Student addStudent(@RequestBody StudentDto studentDto) {
        Student student = modelMapper.map(studentDto,Student.class);
        studentServiceImpl.createStudent(student);
        return student;
    }

   /* @RequestMapping(method = RequestMethod.POST,value = "/student_ids")
     public List<Student> addStudentIdRequest(@RequestBody StudentIdRequest student_ids){
        return studentServiceImpl.addStudentIdRequest(student_ids.getIds())
    }*/

    /*@RequestMapping(method = RequestMethod.POST,value = "/cusStudent_ids")
    public List<CustomStudent> addCusStudent(@RequestBody StudentIdRequest student_ids){
        return studentServiceImpl.addCusStudent(student_ids.getIds());
    }*/

   /* @RequestMapping(method = RequestMethod.POST,value = "/student_name")
    public List<Student> addStudentNameRequest(@RequestBody StudentNameRequest student_name){
        return studentServiceImpl.addStudentNameRequest(student_name.getName());
    }*/

    @RequestMapping(method = RequestMethod.GET,value = "/student")
    public List<StudentDto> getStudents(){
       return studentServiceImpl.getStudents().stream().map(student -> modelMapper.map(student,StudentDto.class))
               .collect(Collectors.toList());
    }

    @RequestMapping(method = RequestMethod.GET,value = "/student/{student_id}")
    public Optional<StudentDto> getStudent(@PathVariable ("student_id")int student_id){
        Optional<Student> student =studentServiceImpl.getStudentById(student_id);
        Optional<StudentDto> studentDto = modelMapper.map(student,Optional.class);
        return studentDto;
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/student/{student_id}")
    public StudentDto updateStudent(@RequestBody StudentDto studentDto,@PathVariable("student_id")int student_id){
        Student student = modelMapper.map(studentDto,Student.class);
        student = studentServiceImpl.updateStudent(student,student_id);
        StudentDto response = modelMapper.map(student,StudentDto.class);
        return response;
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/student/{student_id}")
    public void deleteStudent(@PathVariable("student_id")int student_id){
        studentServiceImpl.deleteStudent(student_id);
    }
}
