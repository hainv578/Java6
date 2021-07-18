package com.Students.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Students.entity.Student;

public interface StudentDao extends JpaRepository<Student,String>{

}
