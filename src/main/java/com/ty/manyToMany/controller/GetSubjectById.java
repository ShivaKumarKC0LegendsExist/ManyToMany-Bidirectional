package com.ty.manyToMany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manyToMany.dto.Subject;


public class GetSubjectById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = entityManagerFactory.createEntityManager();
		
		Subject subject = manager.find(Subject.class, 1);
		System.out.println(subject);
		for (int i = 0; i < subject.getTeachers().size(); i++) {
			System.out.println(subject.getTeachers().get(i));
		}
	}

}
