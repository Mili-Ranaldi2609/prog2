public class Directivo extends Empleado{
    private String area;
    private int edad=0;

    public Directivo(String nombre,int edad, String area) {
        super(nombre);
        this.area = area;
        this.edad=edad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void seJubila(){
        if (edad>50){
            System.out.println("Ya se puede jubilar.");
        }else{
            System.out.println("Puede seguir trabajando");
        }
    }
    @Override
    public String  toString(){
        String s="El director de area se llama "+getNombre()+" y su area correspondiente es: "+area;
        return s;
    }

}
