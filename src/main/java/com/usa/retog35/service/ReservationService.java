package com.usa.retog35.service;

import com.usa.retog35.model.CarModel;
import com.usa.retog35.model.ReservationModel;
import com.usa.retog35.repository.CarRepository;
import com.usa.retog35.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public List<ReservationModel> obtener(){
        return reservationRepository.findAll();
    }

    public void crear(ReservationModel reservation){
        reservation.setStatus("created");
        reservationRepository.save(reservation);
    }
}
