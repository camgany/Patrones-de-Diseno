package builder.practice.restaurantPizzas;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getProduct(){
        return pizza;
    }
    public void createPizza(){
        this.pizza = new Pizza();
    }

    public abstract void buildIngredientes();
    public abstract void buildTipoMasa();
    public abstract void buildTipoQueso();
}
