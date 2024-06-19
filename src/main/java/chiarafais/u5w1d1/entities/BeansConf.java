package chiarafais.u5w1d1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConf {
    @Bean
    public Drink Lemonade (){
        return new Drink("Lemonade", 1.29, 128, 0.33);
    }
    @Bean
    @Primary
    public Drink Water (){
        return new Drink("Water", 1.29, 0,0.5);
    }
    @Bean
    public Drink Wine(){
        return new Drink("Wine", 7.49,607,0.75 );
    }

    @Bean
    @Primary
    public Topping  getCheese (){
        return new Topping("Cheese", 92, 0.69);
    }
    @Bean
    public Topping  getHam (){
        return new Topping("Ham", 35, 0.99);
    }
    @Bean
    public Topping  getOnion (){
        return new Topping("Onions", 22, 0.69);
    }
    @Bean
    public Topping  getPineapple (){
        return new Topping("Pineapple", 24, 0.79);
    }
    @Bean
    public Topping  getSalami (){
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    public List<Topping> toppingMargherita (){
        List<Topping> toppingMargherita = new ArrayList<>();
        Topping cheese = new Topping("Cheese", 92, 0.69);
        Topping tomato = new Topping("Tomato",0,0);
        toppingMargherita.add(cheese);
        toppingMargherita.add(tomato);
        return toppingMargherita;
    }

    @Bean
    @Primary
    public Pizza pizzaMargherita (){
        return new Pizza("Margherita",1104,4.99,toppingMargherita());
    }

    @Bean
    public Pizza pizzaHawaiian (){
        List<Topping> topping = new ArrayList<>();
        topping.addAll(toppingMargherita());
        topping.add(getPineapple());
        topping.add(getHam());
        return new Pizza("Hawaiian Pizza", pizzaMargherita().getPizza_calories()+ getHam().getTopping_calories()+ getPineapple().getTopping_calories(), pizzaMargherita().getPizza_price() + getHam().getTopping_price()+ getPineapple().getTopping_price(),topping);
    }

    @Bean
    public Pizza pizzaSalami (){
        List<Topping> topping = new ArrayList<>();
        topping.addAll(toppingMargherita());
        topping.add(getSalami());
        return new Pizza("Salami Pizza", pizzaMargherita().getPizza_calories()+ getSalami().getTopping_calories(), pizzaMargherita().getPizza_price() + getSalami().getTopping_price(),topping);
    }

    @Bean
    public Pizza pizzaGenerate(Topping topping){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.addAll(toppingMargherita());
        toppingList.add(topping);
        return new Pizza("pizza Chiara",pizzaMargherita().getPizza_calories() + topping.getTopping_calories(),pizzaMargherita().getPizza_price()+ topping.getTopping_price() ,toppingList);
     }

    @Bean
    public Menu Menu (){
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(pizzaMargherita());
        pizzaList.add(pizzaHawaiian());
        pizzaList.add(pizzaSalami());
        pizzaList.add(pizzaGenerate(getOnion()));
        pizzaList.add(pizzaGenerate(getCheese()));
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(getSalami());
        toppingList.add(getHam());
        toppingList.add(getOnion());
        toppingList.add(getPineapple());
        toppingList.add(getCheese());
        List<Drink> drinksList = new ArrayList<>();
        drinksList.add(Lemonade());
        drinksList.add(Water());
        drinksList.add(Wine());
        return new Menu(pizzaList, toppingList, drinksList );

    }

}
