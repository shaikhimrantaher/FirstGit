package com.SiS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SiS.Model.Student;
import com.SiS.Repository.JPA_Repo;

public interface StudentI {
	public int saveStudent(Student student);
	public List<Student>getAllStudent();
	public Student getStudentById();
	 

}
