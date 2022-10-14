package com.valtech.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.springboot.entity.Car;
import com.valtech.springboot.repo.CarRepository;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class CarServiceImpl implements CarService {
	
	
	
	@Autowired
	private CarRepository carRepository;
	
	/* (non-Javadoc)
	 * @see com.valtech.springboot.service.CarService#createCar(com.valtech.springboot.entity.Car)
	 */
	@Override
    @Transactional(propagation=Propagation.REQUIRED)
    public Car createCar(Car car){
        return carRepository.save(car);
        
    }
   
	/* (non-Javadoc)
	 * @see com.valtech.springboot.service.CarService#getCar(int)
	 */
	@Override
	public Car getCar(int id){
		return carRepository.getReferenceById(id);
		
	}
	
	/* (non-Javadoc)
	 * @see com.valtech.springboot.service.CarService#getAllCars()
	 */
	@Override
	public List<Car> getAllCars(){
		return carRepository.findAll();
	}

	@Override
	 @Transactional(propagation=Propagation.REQUIRED)
	public Car updateCar(Car car) {
		// TODO Auto-generated method stub
		 return carRepository.save(car);
	}
}
