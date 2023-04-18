package com.usa.retog35.controller;

import com.usa.retog35.model.CarModel;
import com.usa.retog35.model.ClientModel;
import com.usa.retog35.service.CarService;
import com.usa.retog35.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> obtener(){
        return clientService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ClientModel client){
        clientService.crear(client);
    }
}
