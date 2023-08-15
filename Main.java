import Padre.Pizza;
import Padre.PizzaItaliana;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear ingredientes para la pizza Margarita
        List<String> ingredientesMargarita = new ArrayList<>();
        ingredientesMargarita.add("salsa");
        ingredientesMargarita.add("jamon");
        ingredientesMargarita.add("peperoni");
        ingredientesMargarita.add("champiniones");
        ingredientesMargarita.add("aceitunas");

        // Crear una pizza Margarita
        Pizza pizzaMargarita = new Pizza("Pizza Margarita", 8.99, ingredientesMargarita);
        pizzaMargarita.preparar();// Preparando la pizza...
        System.out.println(pizzaMargarita);

        // Crear ingredientes para la pizza iTALIANA
        List<String> ingredientesPizza = new ArrayList<>();
        ingredientesPizza.add("queso");
        ingredientesPizza.add("tomate");
        ingredientesPizza.add("cebolla");

        // Crear una pizza Italiana
        PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", 10.99, ingredientesPizza, "tomate", 15);
        pizzaItaliana.preparar();
        System.out.println(pizzaItaliana);
    }
}
