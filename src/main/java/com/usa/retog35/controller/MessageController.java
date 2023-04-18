package com.usa.retog35.controller;

import com.usa.retog35.model.GamaModel;
import com.usa.retog35.model.MessageModel;
import com.usa.retog35.service.GamaService;
import com.usa.retog35.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> obtener(){
        return messageService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody MessageModel message){
        messageService.crear(message);
    }
}
