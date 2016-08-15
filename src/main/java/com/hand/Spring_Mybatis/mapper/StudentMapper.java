package com.hand.Spring_Mybatis.mapper;


import com.hand.Spring_Mybatis.entity.Student;


public interface StudentMapper {
       public Student getStudent(int id);
       public void insertStudent(Student student);
       public void deleteStudent(Student student);
       public void updateStudent(Student student);
       
}
