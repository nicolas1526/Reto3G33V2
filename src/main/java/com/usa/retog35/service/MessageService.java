package com.usa.retog35.service;

import com.usa.retog35.model.CarModel;
import com.usa.retog35.model.MessageModel;
import com.usa.retog35.repository.CarRepository;
import com.usa.retog35.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    public List<MessageModel> obtener(){
        return messageRepository.findAll();
    }

    public void crear(MessageModel message){
        messageRepository.save(message);
    }
}
