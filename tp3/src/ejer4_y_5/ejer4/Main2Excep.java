package ejer4_y_5.ejer4;
import ejer4_y_5.ejer4.Alumno;
import ejer4_y_5.ejer4.Escuela;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main2Excep {
    public static void main(String[] args) {
        Escuela school = new Escuela();
        Scanner scr = new Scanner(System.in);
        int option=0;
        do {
            try{
                    System.out.println("1. Agregar nuevo alumno");
                    System.out.println("2. Mostrar lista de alumnos");
                    System.out.println("3. Media de notas");
                    System.out.println("4. Alumno con la nota más alta");
                    System.out.println("5. Buscar alumno por nombre");
                    System.out.println("6. Salir");
                    System.out.print("Seleccione una opción: ");
                    option = scr.nextInt();
                    scr.nextLine(); // se limpia la linea

                    switch (option) {
                        case 1:
                            System.out.print("Nombre del alumno: ");
                            String name= scr.nextLine();
                            System.out.print("Edad del alumno: ");
                            int age = scr.nextInt();
                            System.out.print("Nota del alumno: ");
                            double note = scr.nextDouble();
                            Alumno student = new Alumno(name, age, note);
                            school.addAlumno(student);
                            break;
                        case 2:
                            System.out.println("Lista de alumnos:");
                            for (Alumno a : school) {
                                System.out.println("Nombre: " + a.getName() + ", Edad: " + a.getAge() + ", Nota: " + a.getNote());
                            }
                            break;
                        case 3:
                            double sumaNotas = 0;
                            for (Alumno a : school) {
                                sumaNotas += a.getNote();
                            }
                            double media = sumaNotas / school.getNumberOfStudents();
                            System.out.println("Media de notas: " + media);
                            break;
                        case 4:
                            Alumno alumnoNotaMasAlta = null;
                            double notaMasAlta =0;
                            for (Alumno a : school) {
                                if (a.getNote() > notaMasAlta) {
                                    notaMasAlta = a.getNote();
                                    alumnoNotaMasAlta = a;
                                }
                            }
                            System.out.println("Alumno con la nota más alta: Nombre: " + alumnoNotaMasAlta.getName() + ", Edad: " + alumnoNotaMasAlta.getAge() + ", Nota: " + alumnoNotaMasAlta.getNote());
                            break;
                        case 5:
                            System.out.print("Escriba el nombre del alumno a buscar: ");
                            String nombreBuscar = scr.nextLine().toLowerCase();
                            boolean encontrado = false;
                            for (Alumno a : school) {
                                if (a.equals(new Alumno(nombreBuscar, 0, 0))) {
                                    System.out.println("Alumno encontrado:");
                                    System.out.println("Nombre: " + a.getName() + ", Edad: " + a.getAge() + ", Nota: " + a.getNote());
                                    encontrado = true;
                                    break;
                                } }
                            if(!encontrado){
                                System.out.println("Alumno no encontrado");

                            }
                            break;
                        case 6:
                            System.out.println("Muchas gracias por usar el programa.");
                            break;
                        default:
                            System.out.println("Opción inválida. Inténtelo de nuevo.");
                    }
            }catch(InputMismatchException e){
                System.out.println("InputMismatchException// entrada por usuario invalida");
                scr.nextLine();
            }
                } while (option != 6);
            }
        }


