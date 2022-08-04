package com.SiS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SiS.Model.Student;
import com.SiS.Repository.JPA_Repo;

@Service
public class StudentServiceImpl {
	@Autowired
	private JPA_Repo jpaRepo; 
	
	public Student saveStud()
	{
		Student stu1=new Student();
		
		return null;
		
	}
}
