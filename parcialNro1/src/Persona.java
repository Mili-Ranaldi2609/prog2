public class Persona {
    private int dni;
    private String name;

    public Persona() {
    }

    public Persona(int dni, String name) {
        this.dni = dni;
        this.name=name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
