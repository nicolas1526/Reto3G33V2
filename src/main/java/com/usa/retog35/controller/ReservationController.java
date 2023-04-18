package com.usa.retog35.controller;

import com.usa.retog35.model.MessageModel;
import com.usa.retog35.model.ReservationModel;
import com.usa.retog35.service.MessageService;
import com.usa.retog35.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/all")
    public List<ReservationModel> obtener(){
        return reservationService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ReservationModel reservation){
        reservationService.crear(reservation);
    }
}
