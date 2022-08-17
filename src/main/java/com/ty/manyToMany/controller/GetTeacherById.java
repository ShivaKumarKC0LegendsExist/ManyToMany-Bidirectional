package com.ty.manyToMany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manyToMany.dto.Teacher;

public class GetTeacherById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = entityManagerFactory.createEntityManager();
		
		Teacher teacher = manager.find(Teacher.class, 1);
		System.out.println(teacher);
		for (int i = 0; i < teacher.getSubject().size(); i++) {
			System.out.println(teacher.getSubject().get(i));
		}
	}

}
