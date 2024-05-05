package ejer1;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class AdivinandoNumeros {
    public static void main(String[] args) {
        System.out.println("Adivinando Numeros.");
        Scanner scr=new Scanner(System.in);
        Random r=new Random();
        int numberGuess=r.nextInt(100)+1;
        int attempts=0;
        System.out.println("¡Vamos a jugar!");
        System.out.println("Debes adivinar un numero entre 0 y 100.");
        while(true){
            System.out.println("Ingresa tu numero: ");
            try {
                int number=scr.nextInt();
                attempts++;
                if (number == numberGuess) {
                    System.out.println("¡Felicidades! Has adivinado el numero");
                    System.out.println("Lo has adivinado en "+attempts+" intento/s.");
                    break;
                } else if (number < numberGuess) {
                    System.out.println("El numero a adivinar es mayor.");
                } else {
                    System.out.println("El numero a adivinar es menor.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un numero válido.");
                scr.nextLine(); // Limpiar el buffer de entrada
                attempts++;
            }
        }

        scr.close();
        }

    }

