package ejer2;

public class Universitario extends Libro{
    private String editorial;
    private double price;


    public Universitario(String author, boolean borrowed, String title, int year_of_publication,String editorial, double price) {
        super(author, borrowed, title, year_of_publication);
        this.editorial=editorial;
        this.price=price;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
