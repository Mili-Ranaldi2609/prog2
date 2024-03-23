public class Operario extends Empleado{
    private int dni;
    private int antiguedad=0;

    public Operario(String nombre, int antiguedad, int dni) {
        super(nombre);
        this.antiguedad = antiguedad;
        this.dni=dni;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public void tiempoAnt(){
        if(antiguedad>=10){
            System.out.println("Por su tiempo y dedicacion en este trabajo se lo reconoceremos con un bono extra.");
        }
    }
    @Override
    public String toString(){
        String s="Usted se llama "+getNombre()+" y lleva una antiguedad de: "+antiguedad;
        return s;

    }
}
