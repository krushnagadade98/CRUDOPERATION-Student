package com.jbk.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Student;
import com.jbk.service.StudentService;
@RestController
public class StudentController {

	
	@Autowired
	StudentService studentService;
	

	@GetMapping("/getStudent")
	public Student getStudentController() {
		return studentService.getStudentservice();
		
	}

	

	@PostMapping("/addstudent")
	public String addstudent() {
		
		return studentService.addstudent();
	}
	
	@DeleteMapping("/deletestudent/{id}") 
	public String deleteStudent(@PathVariable int id) {
		
		
		return studentService.deletestudent(id);
	}
	

	@PutMapping("/updatestudent/{id}")
	public String updatestudent( @PathVariable int  id ,@RequestBody Student student) {
		
		return studentService.updatestudent(id, student);
	}
}
