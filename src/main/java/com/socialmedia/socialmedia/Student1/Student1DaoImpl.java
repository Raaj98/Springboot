package com.socialmedia.socialmedia.Student1;

import com.socialmedia.socialmedia.Passport.Passport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class Student1DaoImpl implements StudentDao{

    @PersistenceContext
    private EntityManager entityManager;

    public Student1 save(Student1 student1, Passport passport) {
        entityManager.persist(passport);
        student1.setPassport(passport);
        entityManager.persist(student1);
        return student1;
    }
}
