package builder.practice.restaurantPizzas;


public class Client {
    public static void main(String[] args) {
        Restaurant nostra = new Restaurant();
        BuilderPizza pizzaCarnivora = new PizzaCarnivora();
        BuilderPizza pizzaHawaina = new PizzaHawaina();
        BuilderPizza pizzaClasica = new PizzaClasica();

        System.out.println("--------------------------------PIZZA CARNIVORA--------------------------------");
        nostra.setBuilder(pizzaCarnivora);
        nostra.pizzaPreparada();

        Pizza pizza1 = nostra.getPizzaPreparada();
        pizza1.showInfo();

        System.out.println("---------------------------------PIZZA CLASICA---------------------------------");
        nostra.setBuilder(pizzaClasica);
        nostra.pizzaPreparada();

        Pizza pizza2 = nostra.getPizzaPreparada();
        pizza2.showInfo();

        System.out.println("---------------------------------PIZZA HAWAINA---------------------------------");
        nostra.setBuilder(pizzaHawaina);
        nostra.pizzaPreparada();

        Pizza pizza3 = nostra.getPizzaPreparada();
        pizza3.showInfo();
    }
}
