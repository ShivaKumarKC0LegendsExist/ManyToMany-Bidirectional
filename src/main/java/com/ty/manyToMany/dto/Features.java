package com.ty.manyToMany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Features {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String engineCapacity;
	private String airBag;
	private String autoDoor;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn,inverseJoinColumns = @JoinColumn)
	List<Car> car;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getAirBag() {
		return airBag;
	}

	public void setAirBag(String airBag) {
		this.airBag = airBag;
	}

	public String getAutoDoor() {
		return autoDoor;
	}

	public void setAutoDoor(String autoDoor) {
		this.autoDoor = autoDoor;
	}

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Features [id=" + id + ", engineCapacity=" + engineCapacity + ", airBag=" + airBag + ", autoDoor="
				+ autoDoor + ", car=" + car + "]";
	}
	
	
}
