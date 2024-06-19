package chiarafais.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Topping {
    private String topping_type;
    private int topping_calories;
    private double topping_price;
}
