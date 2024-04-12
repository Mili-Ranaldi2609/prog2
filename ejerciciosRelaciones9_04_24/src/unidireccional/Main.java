package unidireccional;

public class Main {
    public static void main(String[] args) {
        Universidad u1= new Universidad("UTN");
        Universidad u2= new Universidad("UnCUYO");
        Estudiante e= new Estudiante("Jose Fernandez");
        e.setUni(u2);
        System.out.println(e.getNombre()+" pertenece a la universidad: "+e.getUni().getNombreU());
        e.setUni(u1);
        System.out.println("El estudiante :"+e.getNombre()+" se ha cambiado a la universidad: "+e.getUni().getNombreU());

    }
}
