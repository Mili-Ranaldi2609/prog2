package ejer2;

public class Libro implements Prestable {
    private String author;
    private boolean borrowed=false;
    private String title;
    private int year_of_publication;

    public Libro(String author,boolean borrowed,String title, int year_of_publication) {
        this.author = author;
        this.borrowed=borrowed;
        this.title=title;
        this.year_of_publication=year_of_publication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear_of_publication() {
        return year_of_publication;
    }

    public void setYear_of_publication(int year_of_publication) {
        this.year_of_publication = year_of_publication;
    }

    @Override
    public void prestar() {
        if (isBorrowed()==true) {
            System.out.println("El libro '" + getTitle() + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + getTitle() + "' ha sido devuelto.");
        }
    }

    @Override
    public void devolver() {
        if (isBorrowed()==false) {
            System.out.println("El libro '" + getTitle() + "' fue devuelto.");
        } else {
            System.out.println("El libro '" + getTitle() + "' el libro sigue prestado.");
        }

    }
}
