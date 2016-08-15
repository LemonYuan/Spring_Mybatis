package com.hand.Spring_Mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hand.Spring_Mybatis.entity.Student;
import com.hand.Spring_Mybatis.mapper.StudentMapper;

/**
 * Hello world!
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用Springtest框架
@ContextConfiguration("/beans.xml") //加载配置


public class App 
{
	@Autowired
	private StudentMapper studentMapper;
	
	@Test
    public void save(){
    	Student student=studentMapper.getStudent(1);
    	System.out.println(student.getName());
    }
}
