package com.cg.jpacrud.clinet;

	import com.cg.jpacrud.entities.Student;
	import com.cg.jpacrud.service.StudentService;
	import com.cg.jpacrud.service.StudentServiceImpl;
	public class Clinet {
	public static void main(String[] args) {
	//Debug this program as Debug -> Debug as Java Application

	StudentService service = new StudentServiceImpl();

	Student student = new Student();
	// Create Operation
	student.setStudentId(101);
	student.setName("sanjay");
	service.addStudent(student);

	//at this breakpoint, we have added one record to table
	// Retrieve Operation
	student = service.findStudentById(101);
	System.out.print("ID:"+student.getStudentId());
	System.out.println(" Name:"+student.getName());

	// Update Operation
	student = service.findStudentById(101);
	student.setName("Sanjay R");
	service.updateStudent(student);

	//at this breakpoint, we have updated record added in first section

	student = service.findStudentById(101);
	System.out.print("ID:"+student.getStudentId());
	System.out.println(" Name:"+student.getName());

	//at this breakpoint, record is removed from table
	// Delete Operation
	student = service.findStudentById(101);
	service.removeStudent(student);
	System.out.println("End of program/Life cycle completed...");

	}
	}

