package Enrico.com.example.test2.controller;

import Enrico.com.example.test2.domain.Food;
import Enrico.com.example.test2.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // // Indicates that this class is a REST controller
@RequestMapping("foods") // Maps requests to /foods
@RequiredArgsConstructor // creates a constructor with only final variables


public class FoodController {
    private final FoodService foodservice;

    //http://localhost:8080/food
    @GetMapping // Maps GET requests to /foods
    public ResponseEntity<List<Food>> list() { // create a method list, that returns a list of Food types
        return new ResponseEntity<>(foodservice.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Food> findById(@PathVariable long id) { // create a method list, that returns a list of Food types
        return ResponseEntity.ok(foodservice.findById(id));
    }

    @PostMapping
    public ResponseEntity<Food> save(@RequestBody Food food){
        return new ResponseEntity<Food>(foodservice.save(food),HttpStatus.CREATED);
    }
}
