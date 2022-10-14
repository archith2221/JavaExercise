package com.valtech.springboot.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.springboot.entity.Car;

public interface CarService {

	  Car createCar(Car car);



	   Car updateCar(Car car);



	   Car getCar(int id);



	   List<Car> getAllCars();



	}