public class Tecnico extends Operario {
    private String sector;
    private double sueldo=0;

    public Tecnico(String nombre, int antiguedad, int dni, String sector,double sueldo) {
        super(nombre, antiguedad, dni);
        this.sector = sector;
        this.sueldo=sueldo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void antgSdo(){
        if(getAntiguedad()>5){
            System.out.println("Le vamos a aumentar el sueldo un 20%");
            double aumento= sueldo*(20.0/100.0);
            double total =sueldo+aumento;
            System.out.println("El sueldo total quedaria: "+total);
        }
    }
    @Override
    public String toString(){
        String s="Su nombre es: "+getNombre()+ ", pertenece al sector: "+sector+" y tiene una antiguedad de : "+getAntiguedad();
        return s;
    }
}
