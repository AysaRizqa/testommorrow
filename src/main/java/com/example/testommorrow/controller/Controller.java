package com.example.testommorrow.controller;

import com.example.testommorrow.model.Model;
import com.example.testommorrow.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/first")
public class Controller {
    @Autowired(required = true)
    private AutoRepository autoRepository;
    private Model model;

    @GetMapping("all")
    public List<Model> getAll(){
        return autoRepository.getAll();
    }
    @PostMapping("new")
    public void save(@RequestBody Model auto){
        this.autoRepository.save(auto);

    }
    @DeleteMapping(value= "/auto/{id}", produces= "application/json")
    public ResponseEntity<Model> removeAuthorById(@PathVariable(name="id", required = true) long id){

        autoRepository.removeAutoById( id);

        return new ResponseEntity<>(model , HttpStatus.OK);
}
    }





