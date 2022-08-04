package com.SiS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SiS.Model.Student;
import com.SiS.Repository.JPA_Repo;

@Service
public class StudentServiceImpl implements StudentI{
	@Autowired
	private JPA_Repo jpaRepo;

	@Override
	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById() {
		// TODO Auto-generated method stub
		return null;
	} 
}
