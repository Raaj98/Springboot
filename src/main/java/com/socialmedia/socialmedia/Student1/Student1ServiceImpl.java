package com.socialmedia.socialmedia.Student1;

import com.socialmedia.socialmedia.Passport.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student1ServiceImpl {

    @Autowired
    private Student1DaoImpl student1DaoImpl;

    public  Student1 SaveStudent(Student1 student1,Passport passport){
        return student1DaoImpl.save(student1,passport);
    }
}
