package chiarafais.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Drink {
    private String drink_name;
    private double drink_calories;
    private double drink_price;
    private double drink_litres;
}
