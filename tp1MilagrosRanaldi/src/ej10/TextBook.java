package ej10;

public class TextBook extends Book{
    private String course;

    public TextBook() {
    }

    public TextBook(String title, String author, int price, String course) {
        super(title, author, price);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCurso(String course) {
        this.course = course;
    }

    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.println("Curso= "+getCourse());
    }
}
