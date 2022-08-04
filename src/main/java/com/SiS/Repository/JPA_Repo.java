package com.SiS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SiS.Model.Student;
@Repository
public interface JPA_Repo extends JpaRepository<Student, Integer> {

	public Student saveStudent(Student student);
	
	
	
}
