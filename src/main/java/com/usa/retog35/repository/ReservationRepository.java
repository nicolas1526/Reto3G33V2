package com.usa.retog35.repository;

import com.usa.retog35.model.CarModel;
import com.usa.retog35.model.ReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationModel,Integer> {
}
