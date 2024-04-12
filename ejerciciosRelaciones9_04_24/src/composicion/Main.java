package composicion;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Puerta p1= new Puerta("Madera");
        Puerta p2= new Puerta("Madera");
        Puerta p3= new Puerta("Placa");
        Puerta p4= new Puerta("Vidrio");
        Puerta p5= new Puerta("Placa");
        Casa casa = new Casa();
        casa.agregarPuerta(p1.getMaterial());
        casa.agregarPuerta(p2.getMaterial());
        casa.agregarPuerta(p3.getMaterial());
        casa.agregarPuerta(p4.getMaterial());
        casa.agregarPuerta(p5.getMaterial());
        // Mostrar los materiales de las puertas de la casa
        System.out.println("Materiales de las puertas de la casa:");
        for (Puerta puerta : casa.getPuertas()) {
            System.out.println("- " + puerta.getMaterial());
        }
    }
}
