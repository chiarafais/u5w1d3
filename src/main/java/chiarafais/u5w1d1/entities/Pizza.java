package chiarafais.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pizza {
    private String pizza_name;
    private int pizza_calories;
    private double pizza_price;
    private List<Topping> pizza_toppings;
}
