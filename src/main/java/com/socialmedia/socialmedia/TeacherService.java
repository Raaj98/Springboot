package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacher(int teacher_id) {
        return teacherRepository.findById(teacher_id);
    }

    public Teacher updateTeacher(Teacher teacher, int teacher_id) {
        teacher.setId(teacher_id);
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(int teacher_id) {
        teacherRepository.deleteById(teacher_id);
    }
}
