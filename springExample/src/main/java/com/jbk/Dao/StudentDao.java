package com.jbk.Dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Student;
@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory sessionfactory;
	
	//get
	public Student getStudentDao() {
		
		Session session= sessionfactory.openSession();
		Student student=session.get(Student.class, 2);
		return student;
		
	}
	
    
    //add
  	public String addStudent() {
  		Session session=sessionfactory.openSession();
  		Student student=new Student(9,"xyz",20,8888888);
  		session.save(student);
  		session.beginTransaction().commit();

  		return "student added";
  	}
      //delete
  	public String deleteStudent( int id) {
  		Session session=sessionfactory.openSession();
  		Student student=session.get(Student.class, id);
  		if(student==null) {
  			return "student not found";
  		}
  		session.delete(student);
  		session.beginTransaction().commit();;
  		return "student deleted";

  	}
  	
  	//update
  	public String updatestudent(int id,Student student) {
  		Session session=sessionfactory.openSession();
  		Student student1=session.get(Student.class, id);
  		if(student1==null) {
  			return "Student not found";
  		}
  		student1.setName(student.getName());
  		student1.setAge(student.getAge());
  		session.update(student1);
  		session.beginTransaction().commit();
  		return "student updated";
  	}

}
