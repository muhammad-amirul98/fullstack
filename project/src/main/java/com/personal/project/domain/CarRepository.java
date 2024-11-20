package com.personal.project.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
 
public interface CarRepository extends CrudRepository<Car, Long> {
	
	List<Car> findByBrand(String brand);
	
	List<Car> findByBrandOrderByModelYearAsc(String brand);
	
	@Query("select c from Car c where c.brand like %?1")
	List<Car> findByBrandEndsWith(String brand);
	
	List<Car> findByColor(String color);
	
	List<Car> findByModel(String model);
	
	List<Car> findByModelYear(int modelYear);
	
	List<Car> findByBrandAndModel(String brand, String model);
	
	List<Car> findByBrandOrColor(String brand, String color);

}
