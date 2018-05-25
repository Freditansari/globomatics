package com.globomatics.bike.controllers;

//import org.springframework.web.bind.annotation.GetMapping;
import com.globomatics.bike.Repositories.BikeRepository;
import com.globomatics.bike.models.bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/bikes")
public class bikeControllers {
    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping
    public List<bike> list(){
        //List<bike> bikes = new ArrayList<>();
        //return bikes;
        return bikeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody bike bike){
        bikeRepository.save(bike);

    }

    @GetMapping("/{id}")
    public bike get(@PathVariable("id") long id){
        //return new bike();
        return bikeRepository.getOne(id);
    }



//    @RequestMapping("/greetings")
//    public String greetings()
//    {
//        return "greetings from web";
//    }
}
