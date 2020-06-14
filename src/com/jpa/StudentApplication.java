package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.Student;
public class StudentApplication {

	public static void main(String[] args)throws Exception  {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myUnit");
		EntityManager entManager = factory.createEntityManager();
		
		Student student = new Student();
		student.setSno(2);
		student.setSname("Sam");
		student.setSemail("vats");
		student.setSmobile("298887");
		
		EntityTransaction tx = entManager.getTransaction();
		tx.begin();
		entManager.persist(student);
		tx.commit();
		System.out.println("Employee Inserted Succssfully"); 
	}
	
	
}
