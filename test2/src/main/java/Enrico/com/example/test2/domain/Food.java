package Enrico.com.example.test2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data // generates everything, getters, setters, equals, hashcode...
public class Food {
    Long id;
    String name;
    Double price;
}
