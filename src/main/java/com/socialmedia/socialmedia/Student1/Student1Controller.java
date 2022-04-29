package com.socialmedia.socialmedia.Student1;

import com.socialmedia.socialmedia.Passport.Passport;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student1Controller {

    @Autowired
    private Student1ServiceImpl student1ServiceImpl;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/student1")
    public Student1 CreateStudents(@RequestBody Student1Dto student1Dto){
        Student1 student11 = new Student1();
        student11.setName(student1Dto.getName());
        Passport passport = new Passport();
        passport.setPassportNo(student1Dto.getPassportNo());
        return student1ServiceImpl.SaveStudent(student11,passport);
    }
}
