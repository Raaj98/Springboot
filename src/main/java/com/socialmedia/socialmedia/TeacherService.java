package com.socialmedia.socialmedia;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    List<Teacher> teachers = new ArrayList<Teacher>();

    public void addTeacher( Teacher teacher){
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }

    public Teacher getTeacher(String teacher_id){
        Teacher response = null;
        for (Teacher teacher:teachers){
            if (teacher.getId().equals(teacher_id)){
                response=teacher;
                break;
            }
        }
        return response;
    }

    public Teacher updateTeacher( Teacher teacher,String teacher_id) {
        Teacher response = null;
        for (Teacher teacher_obj : teachers) {
            if (teacher_obj.getId().equals(teacher_id)) {
                teacher_obj.setName(teacher.getName());
                teacher_obj.setRole(teacher.getRole());
                response=teacher_obj;
                break;
            }
        }
        return response;
    }

    public void deleteTeacher(String teacher_id){
        List<Teacher>new_teachers_list = new ArrayList<Teacher>();
        for (Teacher teacher:teachers){
            if (!teacher.getId().equals(teacher_id)){
                new_teachers_list.add(teacher);
            }
        }
        teachers=new_teachers_list;
    }
}
