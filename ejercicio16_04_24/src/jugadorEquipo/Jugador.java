package jugadorEquipo;

public class Jugador {
    private String nombre;
    private String posicion;
    private int numCamiseta;
    private int edad;

    public Jugador(String nombre,String posicion,int numCamiseta,int edad) {
        this.nombre=nombre;
        this.posicion=posicion;
        this.numCamiseta=numCamiseta;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

}
