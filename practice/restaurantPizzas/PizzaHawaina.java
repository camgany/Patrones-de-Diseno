package builder.practice.restaurantPizzas;

import builder.practice.restaurantPizzas.BuilderPizza;

public class PizzaHawaina extends BuilderPizza {


    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("pina, salsa tomate, otro.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("masa normal");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("quezo mozarella tipo2");
    }
}
