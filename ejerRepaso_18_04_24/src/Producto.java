public class Producto {
    private String nombre;
    private double precio;
    private int cantStock=0;

    public Producto(String nombre, double precio,int cantStock) {

        this.nombre=nombre;
        this.precio=precio;
        this.cantStock = cantStock;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void infoProduct(){
        System.out.println("Producto: "+nombre+"- precio:"+precio+"- stock:"+cantStock);
    }
}
