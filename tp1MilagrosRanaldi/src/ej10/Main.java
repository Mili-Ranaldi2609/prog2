package ej10;

public class Main {
    public static void main(String[] args) {
        TextBook textBook1=new TextBook("Lenguaje","Julieta",2000,"3 año");
        TextBooksNUC textBooksNational1=new TextBooksNUC("Historia","Pablo",5000,"5 año","UTN");
        Novel n1=new Novel("Mil amores","Guadalupe",3500,"Romance");
        System.out.println("Libro de texto");
        textBook1.mostrardatos();
        System.out.println("Libro de universidad");
        textBooksNational1.mostrardatos();
        System.out.println("Novela");
        n1.mostrardatos();
    }
}
