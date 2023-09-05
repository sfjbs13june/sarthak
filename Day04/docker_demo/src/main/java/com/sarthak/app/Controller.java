package com.sarthak.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/name")
    public ResponseEntity<String> getName(){
    return new ResponseEntity<String>("Sarthak Singh", HttpStatus.OK);
}
    @GetMapping("/age")
    public ResponseEntity<Integer> getAge(){
        return new ResponseEntity<Integer>(23, HttpStatus.OK);
    }
    @GetMapping("/address")
    public ResponseEntity<String> getAddress(){
        return new ResponseEntity<String>("XYZ", HttpStatus.OK);
    }
}
