import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        double num1=0;
        double num2=0;
        char operacion;
        boolean validInput=false;
        while(validInput==false){
        try{
            System.out.println("Ingrese el primer numero: ");
            num1 = scr.nextDouble();
            validInput=true;


        }catch(InputMismatchException e){
            System.out.println("InputMismatchException // Debe ingresar un numero valido");

            scr.nextLine();
        }
        }
        validInput=false;
        while(validInput==false){
        try{
            System.out.println("Ingrese el segundo numero: ");
            num2 = scr.nextDouble();
            validInput=true;

        }catch(InputMismatchException e){
            System.out.println("InputMismatchException // Debe ingresar un numero valido");

        scr.nextLine();
    }}
        validInput=false;
        while(validInput==false){
        try {
            System.out.print("Seleccione la operación (+, -, *, /): ");
            operacion = scr.next().charAt(0);
            scr.nextLine(); // Limpiar el buffer del scanner

            switch (operacion) {
                case '+':
                    System.out.println("Resultado: " + (num1 + num2));
                    validInput = true;
                    break;
                case '-':
                    System.out.println("Resultado: " + (num1 - num2));
                    validInput = true;
                    break;
                case '*':
                    System.out.println("Resultado: " + (num1 * num2));
                    validInput = true;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                        validInput = true;
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException // Debe ingresar una operación válida.");
            scr.nextLine(); // Limpiar el buffer del scanner
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException //"+ e.getMessage());
        }
    }
}}
