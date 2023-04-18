package com.usa.retog35.controller;

import com.usa.retog35.model.ClientModel;
import com.usa.retog35.model.GamaModel;
import com.usa.retog35.service.ClientService;
import com.usa.retog35.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama")
public class GamaController {

    @Autowired
    GamaService gamaService;

    @GetMapping("/all")
    public List<GamaModel> obtener(){
        return gamaService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody GamaModel gama){
        gamaService.crear(gama);
    }
}
