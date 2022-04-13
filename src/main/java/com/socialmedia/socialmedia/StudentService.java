package com.socialmedia.socialmedia;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {

    List<Student> students = new ArrayList<Student>();

    public void addStudent( Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> addStudentIdRequest(String[] student_ids){
        List<Student>new_student_list = new ArrayList<Student>();
        for (Student student:students){
            for (int i=0;i<student_ids.length;i++) {
                if (student.getId().equals(student_ids[i])) {
                    new_student_list.add(student);
                    break;
                }
            }
        }
        return new_student_list;
    }

    public List<CustomStudent> addCusStudent(String[] student_ids){
        List<CustomStudent> cusStudents = new ArrayList<CustomStudent>();
        for (Student student:students){
            for (int i=0;i<student_ids.length;i++){
                if (student.getId().equals(student_ids[i])){
                    CustomStudent customStudent = new CustomStudent(student.getId(),student.getName());
                    cusStudents.add(customStudent);
                    break;
                }
            }
        }
        return cusStudents;
    }

    public Student getStudent(String student_id) {
        Student response = null;
        for (Student student : students) {
            if (student.getId().equals(student_id)) {
                response = student;
                break;
            }
        }
        return response;
    }

    public Student updateStudent( Student student,String student_id){
        Student response=null;
        for (Student student_obj:students){
            if (student_obj.getId().equals(student_id)) {
                student_obj.setName(student.getName());
                student_obj.setClassName(student.getClassName());
                response=student_obj;
                break;
            }
        }
        return response;
    }

    public void deleteStudent(String student_id){
        List<Student>new_student_list = new ArrayList<Student>();
        for (Student student:students) {
            if (!student.getId().equals(student_id)) {
                new_student_list.add(student);
            }
            students=new_student_list;
        }
    }
}
