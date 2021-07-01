package ar.edu.unq.desapp.grupoC.backenddesappapi.listener.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/listen")
    public ResponseEntity.BodyBuilder listen() {
        System.out.println("\n\nRECEIVED NOTIFICATION FROM REDIS PUBLISHER\n\n");

        return ResponseEntity.ok();
    }
}
