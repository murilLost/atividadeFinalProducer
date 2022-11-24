package br.com.fiap.scjr.atividadeFinalProducer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.fiap.scjr.atividadeFinalProducer.form.DroneForm;
import br.com.fiap.scjr.atividadeFinalProducer.senders.QueueSender;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/drone", consumes = "application/json")
public class MessageController {

    @Autowired
    private QueueSender sender;

    @PostMapping
    public ResponseEntity<?> send(@Valid @RequestBody DroneForm droneForm){
		sender.send(new Gson().toJson(droneForm));
		return ResponseEntity.ok().build();
    }
}
