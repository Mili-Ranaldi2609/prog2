package ejer1;
import java.util.ArrayList;
import java.util.List;

public class TiendaMascotas {
    private List<Animal> animales;

    public TiendaMascotas() {
        this.animales = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animales.add(animal);
        System.out.println(animal.getName()+" ha sido agregado a la tienda de mascotas");
    }

    public void selllAnimal(String name) {
        animales.removeIf(animal -> animal.toString().contains(name));
        System.out.println(name+" ha sido vendido");
    }

    public void feedAnimal(String n) {
        for (Animal animal : animales) {
            if (animal.getName().equals(n)) {
                System.out.println(animal.feed(n));
                System.out.println("/// ha terminado de comer///");

            }

        }

    }


    public void toListAnimals() {
        System.out.println("Lista de animales: ");
        for (Animal animal :animales) {

            System.out.println("----"+animal.toString());
        }
    }
}

