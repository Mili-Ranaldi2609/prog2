package ejer1;

public class Main {
    public static void main(String[] args) {
        TiendaMascotas t= new TiendaMascotas();
        //Crear animales
        Perro dog= new Perro(2,"perro","Loki",23012.3,"Caniche",false);
        Gato cat= new Gato(1,"gato","Garfield",12000.0,"Naranja",true);
        Ave bird= new Ave(1,"ave","Rey",2000.0,"Canario",false);
        Pez fish= new Pez(2,"pez","Poseidon",1040.0,true,"Hlacanthus ciliaris");
        dog.feed("Semillas");
        fish.feed("Alimento");
        //agregar animales
        t.addAnimal(dog);
        t.addAnimal(cat);
        t.addAnimal(bird);
        t.addAnimal(fish);
        //alimentar animales
        t.feedAnimal("Poseidon");
        t.feedAnimal("Loki");
        //listar animales
        t.toListAnimals();
        //vender animales
        t.selllAnimal("Loki");
        t.selllAnimal("Rey");
        ///
        t.toListAnimals();

    }
}
