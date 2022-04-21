package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

/*    public List<Student> addStudentIdRequest(String[] student_ids) {
        List<Student> new_student_list = new ArrayList<Student>();
        for (Student student : students) {
            for (int i = 0; i < student_ids.length; i++) {
                if (student.getId().equals(student_ids[i])) {
                    new_student_list.add(student);
                    break;
                }
            }
        }
        return new_student_list;
    }

    public List<CustomStudent> addCusStudent(String[] student_ids) {
        List<CustomStudent> cusStudents = new ArrayList<CustomStudent>();
        for (Student student : students) {
            for (int i = 0; i < student_ids.length; i++) {
                if (student.getId().equals(student_ids[i])) {
                    CustomStudent customStudent = new CustomStudent(student.getId(), student.getName());
                    cusStudents.add(customStudent);
                    break;
                }
            }
        }
        return cusStudents;
    }

    public List<Student> addStudentNameRequest(String[] student_name) {
        List<Student> new_student_list = new ArrayList<>();
        for (Student student : students) {
            for (int i = 0; i < student_name.length; i++) {
                if (student.getName().equals(student_name[i])) {
                    new_student_list.add(student);
                    break;
                }
            }
        }
        return new_student_list;
    }*/

    public Optional<Student> getStudent(int student_id) {
      return studentRepository.findById(student_id);
    }

    public Student updateStudent(Student student, int student_id) {
        student.setId(student_id);
        return studentRepository.save(student);
    }

    public void deleteStudent(int student_id) {
        studentRepository.deleteById(student_id);
    }

 /*   public void addStudents(Student[] studentList) {
        for (StudentTeacher stu:studentTeacherList){
                studentTeacherList.add(stu);
        }
    }

    public List<StudentTeacher> getStudentTeacher() {
        return studentTeacherList;
    }*/
}
