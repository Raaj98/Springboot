package com.socialmedia.socialmedia.Student;

import com.socialmedia.socialmedia.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
