package Padre;

import java.util.List;  // Importación de la interfaz List

public class PizzaItaliana extends Pizza {
    private String salsa;
    private int tiempoEnHorno;

    // Constructor de la clase PizzaItaliana
    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
        // Llamada al constructor de la clase padre
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    // Sobrescritura del método preparar para la pizza italiana
    @Override
    public void preparar() {
        System.out.println("Preparando la pizza italiana...");
        super.preparar();
        System.out.println("Agregando salsa " + salsa + " durante la preparación.");
        for (String topping : getIngredientes()) {
            System.out.println("Agregando topping " + topping + " a la pizza italiana.");
        }
    }

    // Sobrescritura del método toString para obtener una representación en cadena
    @Override
    public String toString() {
        String mensaje = super.toString() + ", salsa: " + salsa + ", tiempo en horno: " + tiempoEnHorno;
        if (super.estaLista) {
            mensaje += " (Italiana)";  // Agregar indicador si la pizza está lista y es italiana
        }
        return mensaje;
    }
}
