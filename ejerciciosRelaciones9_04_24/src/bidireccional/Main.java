package bidireccional;

public class Main {
    public static void main(String[] args) {
        Persona p1= new Persona("Luis");
        Persona p2= new Persona("Jose");
        Persona p3= new Persona("Fernando");
        Persona p4= new Persona("Maria");
        Persona p5= new Persona("Camila");
        Libro l1=new Libro("100 años de soledad");
        Libro l2=new Libro("Alicia en el pais de las maravillas");
        Libro l3=new Libro("Sigue mi voz");
        Libro l4=new Libro("Xodo");
        Libro l5=new Libro("El codigo Da Vinci");
        p1.agregarLibro(l1);
        p1.agregarLibro(l3);
        p2.agregarLibro(l1);
        p3.agregarLibro(l5);
        p3.agregarLibro(l2);
        p4.agregarLibro(l4);
        p5.agregarLibro(l1);
        p5.agregarLibro(l3);
        // Mostrar la lista de libros de cada persona
        for (Persona persona : new Persona[]{p1, p2, p3, p4, p5}) {
            System.out.println(persona.getNombre() + " tiene los siguientes libros:");
            for (Libro libro : persona.getLibros()) {
                System.out.println("- " + libro.getTitulo());
            }
            System.out.println();
        }

        // Mostrar la lista de personas que poseen un libro en particular
        for (Libro libro : new Libro[]{l1, l2, l3, l4, l5}) {
            System.out.println("El libro \"" + libro.getTitulo() + "\" es poseído por:");
            for (Persona persona : libro.getPersonas()) {
                System.out.println("- " + persona.getNombre());
            }
            System.out.println();
        }


    }
}
