package builder.practice.restaurantPizzas;

import builder.practice.restaurantPizzas.BuilderPizza;

public class PizzaCarnivora extends BuilderPizza {

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Carne, Salsa Tomate, Otro.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa Especial");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Quezo Mozarella");
    }
}
