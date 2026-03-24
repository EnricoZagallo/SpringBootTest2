package Enrico.com.example.test2.service;

import Enrico.com.example.test2.domain.Food;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service // // Marks this class as a service layer component responsible for business logic
public class FoodService {
    private List<Food> foods = List.of(new Food(1L, "carne",10.0),//return a static list of foods
            new Food(2L,"Arroz", 3.0));

    public List<Food> listAll() { // create a method list, that returns a list of Food types
        return foods;
    }

    public Food findById(long id) { // create a method list, that returns a list of Food types
        return foods.stream()
                .filter(food -> food.getId().equals(id))
                .findFirst()
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Food not found"));
    }

}
