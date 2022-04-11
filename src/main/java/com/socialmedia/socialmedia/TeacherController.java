package com.socialmedia.socialmedia;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeacherController {
    List<Teacher> teachers = new ArrayList<Teacher>();

    @RequestMapping(method = RequestMethod.POST,value = "/teacher")
    public void addTeacher(@RequestBody Teacher teacher){
        teachers.add(teacher);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/teacher")
    public List<Teacher> getTeachers(){
        return teachers;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/teacher/{teacher_id}")
    public Teacher getTeacher(@PathVariable("teacher_id")String teacher_id){
        Teacher response = null;
        for (Teacher teacher:teachers){
            if (teacher.getId().equals(teacher_id)){
                response=teacher;
                break;
            }
        }
        return response;
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/teacher/{teacher_id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable("teacher_id")String teacher_id) {
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
    @RequestMapping(method = RequestMethod.DELETE,value = "/teacher/{teacher_id}")
    public void deleteTeacher(@PathVariable("teacher_id")String teacher_id){
        List<Teacher>new_teachers_list = new ArrayList<Teacher>();
        for (Teacher teacher:teachers){
            if (!teacher.getId().equals(teacher_id)){
                new_teachers_list.add(teacher);
            }
        }
        teachers=new_teachers_list;
    }
}

