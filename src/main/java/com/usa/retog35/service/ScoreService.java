package com.usa.retog35.service;

import com.usa.retog35.model.CarModel;
import com.usa.retog35.model.ScoreModel;
import com.usa.retog35.repository.CarRepository;
import com.usa.retog35.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    ScoreRepository scoreRepository;

    public List<ScoreModel> obtener(){
        return scoreRepository.findAll();
    }

    public void crear(ScoreModel score){
        scoreRepository.save(score);
    }
}
