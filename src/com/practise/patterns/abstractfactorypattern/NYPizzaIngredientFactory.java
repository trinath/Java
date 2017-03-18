package com.practise.patterns.abstractfactorypattern;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough(){
        return new ThinCrushDough();
    }
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
    public Cheese createCheese(){
        return new ReggianoCheese();
    }
    public Veggies[] createVeggies(){
        Veggies[] veggies = { new Onion(), new Garlic()};
        return veggies;
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    public Clams createClam(){
        return new FreshClams();
    }

}
