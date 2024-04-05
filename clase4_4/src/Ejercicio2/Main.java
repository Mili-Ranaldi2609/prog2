package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Spartacus", 10, 100, 15,20);
        Mago mago = new Mago("Merlin", 8, 80, 20, 30);
        Picaro picaro = new Picaro("Igor", 12, 70, 18,12);

        while (guerrero.estaVivo() && mago.estaVivo() && picaro.estaVivo()) {
            // Turno del Guerrero
            int danoGuerrero = guerrero.atacar();
            mago.defender(danoGuerrero);

            // Turno del Mago
            int danoMago = mago.atacar();
            picaro.defender(danoMago);

            // Turno del Pícaro
            int danoPicaro = picaro.atacar();
            guerrero.defender(danoPicaro);

            // Mostrar estado de los personajes
            System.out.println("\nEstado de los personajes:");
            System.out.println("Guerrero: " + guerrero.getNombre() + " - Puntos de vida: " + guerrero.getRpg());
            System.out.println("Mago: " + mago.getNombre() + " - Puntos de vida: " + mago.getRpg());
            System.out.println("Pícaro: " + picaro.getNombre() + " - Puntos de vida: " + picaro.getRpg());
        }

        // Mostrar resultado final
        if (!guerrero.estaVivo()) {
            System.out.println("El Guerrero ha sido derrotado.");
        } else if (!mago.estaVivo()) {
            System.out.println("El Mago ha sido derrotado.");
        } else {
            System.out.println("El Pícaro ha sido derrotado.");
        }
    }
    }


