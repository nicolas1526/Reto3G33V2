package com.usa.retog35.service;

import com.usa.retog35.model.CarModel;
import com.usa.retog35.model.GamaModel;
import com.usa.retog35.repository.CarRepository;
import com.usa.retog35.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {
    @Autowired
    GamaRepository gamaRepository;

    public List<GamaModel> obtener(){
        return gamaRepository.findAll();
    }

    public void crear(GamaModel gama){
        gamaRepository.save(gama);
    }
}
