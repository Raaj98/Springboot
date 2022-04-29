package com.socialmedia.socialmedia.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public List<Student> getStudents();
    public Student createStudent(Student student);
    public Optional<Student> getStudentById(Integer id);
    public Student updateStudent(Student student,Integer id);
    public void deleteStudent(Integer id);
}
