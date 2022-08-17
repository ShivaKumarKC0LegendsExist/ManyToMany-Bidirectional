package com.ty.manyToMany.controller;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manyToMany.dto.Car;
import com.ty.manyToMany.dto.Features;

public class TestCarFeatures {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Car car1 = new Car();
		car1.setBrand("Maruthi");
		car1.setCapacity("4 Seated");
		
		Car car2 = new Car();
		car2.setBrand("BMW");
		car2.setCapacity("5 Seated");
		
		Car car3 = new Car();
		car3.setBrand("Mercedies");
		car3.setCapacity("2 Seated");
		
		Features features = new Features();
		features.setAirBag("3 STAR");
		features.setAutoDoor("Normal");
		features.setEngineCapacity("5000cc");
		List<Car> cars1 = new ArrayList<Car>();
		cars1.add(car1);
		features.setCar(cars1);
		
		Features features1 = new Features();
		features1.setAirBag("5 STAR");
		features1.setAutoDoor("Quick");
		features1.setEngineCapacity("10000cc");
		List<Car> cars2 = new ArrayList<Car>();
		cars2.add(car1);
		cars2.add(car3);
		features1.setCar(cars2);
		
		transaction.begin();
		manager.persist(car1);
		manager.persist(car2);
		manager.persist(car3);
		manager.persist(features1);
		manager.persist(features);
		transaction.commit();
		
	}

}
