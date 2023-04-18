package com.usa.retog35.service;

import com.usa.retog35.model.CarModel;
import com.usa.retog35.model.ClientModel;
import com.usa.retog35.repository.CarRepository;
import com.usa.retog35.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener(){
        return clientRepository.findAll();
    }

    public void crear(ClientModel client){
        clientRepository.save(client);
    }
}
