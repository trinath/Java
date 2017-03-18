package com.practise.patterns.abstractfactorypattern;

public class NYPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Newyork Style Pizza");
        } else if(item.equals("veggie")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Newyork Style Pizza");
        } else if(item.equals("clam")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Newyork Style Pizza");
        } else if(item.equals("pepperoni")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Newyork Style Pizza");
        }
        return pizza;
    }
}
