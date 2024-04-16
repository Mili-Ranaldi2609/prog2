package ejer2;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Libro>libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    public void addBook(Libro libro){
        this.libros.add(libro);
    }
    public void toListBook(){
        System.out.println("Lista de libros disponibles");
        for(Libro libro:libros){
            if(!libro.isBorrowed()){
                System.out.println("- " + libro.getTitle() + " (" + libro.getAuthor() + ")");
            }
        }
    }
    public void prestarLibro(String title){
        for(Libro libro:libros){
            if(libro.getTitle().equals(title) && libro.isBorrowed()==true){
                libro.prestar();
                return;
            }
        }
    }
    public void devolverLibro(String title) {
        for (Libro libro : this.libros) {
            if (libro.getTitle().equals(title) && libro.isBorrowed()==false) {
                libro.devolver();
                return;
            }
        }

    }




}
