package com.byron.msprofilestalent.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/profiles")
public class ProfileController {

    @GetMapping
    public ResponseEntity getUser(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
