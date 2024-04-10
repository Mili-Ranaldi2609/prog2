package ej10;

public class Novel extends Book{
    private String type;

    public Novel() {
    }

    public Novel(String title, String author, int price, String type) {
        super(title, author, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.println("Tipo= "+getType());
    }
}
