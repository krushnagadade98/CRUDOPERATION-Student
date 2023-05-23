package com.jbk.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.StudentDao;
import com.jbk.entity.Student;
@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;

	//get
	public Student getStudentservice() {

		return studentDao.getStudentDao();
	}
	
   
   
	//add
	public String addstudent() {

		return studentDao.addStudent();
	}
	//delete
	public String deletestudent(int id) {

		return studentDao.deleteStudent(id);
	}
	
	//update
	public String updatestudent(int id,Student student) {
		return studentDao.updatestudent(id,student);
	}


}
