package com.usa.retog35.repository;

import com.usa.retog35.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarModel,Integer> {
}
