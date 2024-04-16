package ejer2;

public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        Libro book1 = new Novela("Dot Hutchinson", true, "El jardin de las mariposas", 2016,"Planeta",9689.99);
        Libro book2 = new Universitario("James Stewart", false, "Calculo de una variable, Transcendentes Tempranas", 2010,"Ediciones Paraninfo",229600.70);
        Libro book3 = new Infantil("David Walliams", true, "Perrobot", 2024,"Libroide",36700);
        //Agregar libros a la biblioteca
        b.addBook(book1);
        b.addBook(book2);
        b.addBook(book3);
        //probando metodo prestar
        book2.prestar();
        //mostrar lista
        b.toListBook();
        //cambiar estado del libro
        book1.setBorrowed(false);
        book2.setBorrowed(true);
        book3.setBorrowed(false);
        //usar metodo de la biblioteca prestar libro
        b.prestarLibro("El jardin de las mariposas");
        b.prestarLibro("Calculo de una variable, Transcendentes Tempranas");
        b.prestarLibro("Perrobot");

        b.toListBook();
        //usar metodo de la biblioteca devolver libro
        b.devolverLibro("Calculo de una variable, Transcendentes Tempranas");
        b.devolverLibro("El jardin de las mariposas");
        b.devolverLibro("Perrobot"); // Este libro no está en la biblioteca

        book2.setBorrowed(false);
        //probar metodo devolver
        book2.devolver();

        b.toListBook();
    }
}
