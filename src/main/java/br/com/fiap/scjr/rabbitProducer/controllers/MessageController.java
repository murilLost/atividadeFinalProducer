package br.com.fiap.scjr.rabbitProducer.controllers;

import br.com.fiap.scjr.rabbitProducer.form.DroneForm;
import br.com.fiap.scjr.rabbitProducer.senders.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.gson.Gson;

@RestController
@RequestMapping(value="/drone", consumes = "application/json")
public class MessageController {

    @Autowired
    private QueueSender sender;

    @PostMapping
    public ResponseEntity<?> send(@RequestBody @Validated DroneForm droneForm, UriComponentsBuilder uriBuilder){
        sender.send(new Gson().toJson(droneForm));
        return ResponseEntity.ok().build();
    }
}
