package Padre;
import java.util.ArrayList;
import java.util.List;
public class Pizza {  // Declaración de la clase Pizza en el paquete Padre
    private String nombre;       // Campo para almacenar el nombre de la pizza
    private double precio;       // Campo para almacenar el precio de la pizza
    private List<String> ingredientes;  // Campo para almacenar los ingredientes de la pizza
    boolean estaLista;  // Campo para indicar si la pizza está lista para ser servida

    // Constructor de la clase Pizza
    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.estaLista = false;  // Inicialmente, la pizza no está lista
    }

    // Método para preparar la pizza
    public void preparar() {
        System.out.println("Preparando la pizza...");
        estaLista = true;  // Marcar la pizza como lista
    }

    // Método para agregar un ingrediente adicional a la pizza
    public void agregarTopping(String topping) {
        ingredientes.add(topping);
    }

    // Método para obtener la lista de ingredientes de la pizza
    public List<String> getIngredientes() {
        return ingredientes;
    }

    // Sobrescritura del método toString para obtener una representación en cadena
    @Override
    public String toString() {
        String mensaje = "Nombre de la pizza: " + nombre + ", y su precio es: " + precio;
        if (nombre.equals("Pizza Margarita")) {
            mensaje += ", Ingredientes: " + ingredientes.toString();  // Agregar ingredientes si es Margarita
        }
        if (estaLista) {
            mensaje += ", la pizza está lista para ser servida.";  // Agregar mensaje si la pizza está lista
        }
        return mensaje;
    }
}
