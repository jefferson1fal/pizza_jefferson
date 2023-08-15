package Padre;

public class Topping {
    private String nombre;  // Campo para almacenar el nombre del topping

    // Constructor de la clase Topping
    public Topping(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar el topping a una pizza
    public void agregar(Pizza pizza) {
        pizza.agregarTopping(nombre);  // Llamada al método agregarTopping de la pizza
        System.out.println("Agregando topping " + nombre + " a la pizza.");
    }
}
