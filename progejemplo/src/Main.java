class Persona{
    private String nombre;
    private int dni;
    private int edad;
    private double altura;
    public Persona(String nombre, int dni, int edad, double altura){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
        this.altura=altura;
    }
    public double getAltura(){
        return altura;
    }
    public int getDni(){
        return dni;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
}
public class Main {
    public static void main(String[] args) {
        Persona persona1= new Persona("Milagros Ranaldi",44437603,21, 1.51);
        System.out.println("Nombre: "+persona1.getNombre()+" dni: "+persona1.getDni()+" edad: "+persona1.getEdad()+ " altura: "+persona1.getAltura());
    }
}